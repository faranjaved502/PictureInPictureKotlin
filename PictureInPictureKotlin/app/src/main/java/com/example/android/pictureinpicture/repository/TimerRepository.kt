package com.example.android.pictureinpicture.repository

import androidx.lifecycle.MutableLiveData

interface TimerRepository {
    fun getTime(): MutableLiveData<Long>
    fun started(): MutableLiveData<Boolean>
    fun clearTimer()
}