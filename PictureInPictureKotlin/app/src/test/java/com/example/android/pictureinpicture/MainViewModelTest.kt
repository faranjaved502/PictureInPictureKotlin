package com.example.android.pictureinpicture

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.example.android.pictureinpicture.framework.MainCoroutineRule
import com.example.android.pictureinpicture.repository.TimerRepository
import com.example.android.pictureinpicture.usecase.SystemClockWrapper
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import kotlin.test.assertEquals

class MainViewModelTest {

    @Rule
    @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @ExperimentalCoroutinesApi
    @get:Rule
    val coroutineRule = MainCoroutineRule()

    private lateinit var viewModel: MainViewModel

    @Mock
    lateinit var systemClockWrapper: SystemClockWrapper

    @Mock
    lateinit var timerRepository: TimerRepository

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        val timeMillis = MutableLiveData<Long>()
        val start = MutableLiveData<Boolean>()
        Mockito.`when`(timerRepository.getTime()).thenReturn(timeMillis)
        Mockito.`when`(timerRepository.started()).thenReturn(start)
        viewModel = MainViewModel(systemClockWrapper, timerRepository)
    }

    @Test
    fun `clear sets startUptimeMillis to SystemClock uptimeMillis and timeMillis to 0L`() {
        // Mock
        val expectedUptimeMillis = 123456L
        Mockito.`when`(systemClockWrapper.uptimeMillis()).thenReturn(expectedUptimeMillis)

        val timeMillis = MutableLiveData<Long>()
        timeMillis.value = 123L

        Mockito.`when`(timerRepository.getTime()).thenReturn(timeMillis)
        Mockito.doNothing().`when`(timerRepository).clearTimer()

        //then
        viewModel.clear()

        // assert & verify
        assertEquals(expectedUptimeMillis, viewModel.startUptimeMillis)
        verify(timerRepository).clearTimer()
    }

    @Test
    fun `startOrPause starts or pauses the process based on _started value`() = runBlocking {
        // Case 1: _started value is false
        viewModel.startOrPause()
        assertEquals(true, viewModel.started.value)

        // Case 2: _started value is true
        viewModel.startOrPause()
        assertEquals(false, viewModel.started.value)
    }

    @Test
    fun `time transformation handles with 0 milliseconds`() {
        // Mock
        val timeMillis = MutableLiveData<Long>()
        timeMillis.value = 0L
        viewModel.timeMillis = timeMillis

        // then
        val formattedTime = viewModel.time.value

        // assert
        assertEquals("00:00:00", formattedTime)
    }
}

