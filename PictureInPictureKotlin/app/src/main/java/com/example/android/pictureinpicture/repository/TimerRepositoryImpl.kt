package com.example.android.pictureinpicture.repository

import androidx.lifecycle.MutableLiveData

class TimerRepositoryImpl: TimerRepository {

    private val _timeMillis = MutableLiveData(0L)
    private val _started = MutableLiveData(false)

    override fun getTime(): MutableLiveData<Long> = _timeMillis

    override fun started(): MutableLiveData<Boolean> =_started

    override fun clearTimer() {
        _timeMillis.postValue(0L)
    }
}