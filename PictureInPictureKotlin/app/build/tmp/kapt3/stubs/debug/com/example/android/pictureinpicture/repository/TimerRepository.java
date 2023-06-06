package com.example.android.pictureinpicture.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/example/android/pictureinpicture/repository/TimerRepository;", "", "clearTimer", "", "getTime", "Landroidx/lifecycle/MutableLiveData;", "", "started", "", "app_debug"})
public abstract interface TimerRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<java.lang.Long> getTime();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<java.lang.Boolean> started();
    
    public abstract void clearTimer();
}