package com.example.android.pictureinpicture.usecase

import android.os.SystemClock

class SystemClockWrapperImpl: SystemClockWrapper {

    override fun uptimeMillis(): Long {
        return SystemClock.uptimeMillis()
    }
}