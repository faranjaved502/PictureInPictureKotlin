package com.example.android.pictureinpicture.usecase

interface SystemClockWrapper {
    fun uptimeMillis(): Long
}