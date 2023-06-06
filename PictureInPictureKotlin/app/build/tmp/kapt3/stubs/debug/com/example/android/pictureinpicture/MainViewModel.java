package com.example.android.pictureinpicture;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010!\u001a\u00020\u001fJ\u0015\u0010\"\u001a\u00020\u001f*\u00020#H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/example/android/pictureinpicture/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "systemClockWrapper", "Lcom/example/android/pictureinpicture/usecase/SystemClockWrapper;", "timerRepository", "Lcom/example/android/pictureinpicture/repository/TimerRepository;", "(Lcom/example/android/pictureinpicture/usecase/SystemClockWrapper;Lcom/example/android/pictureinpicture/repository/TimerRepository;)V", "_started", "Landroidx/lifecycle/MutableLiveData;", "", "job", "Lkotlinx/coroutines/Job;", "startUptimeMillis", "", "getStartUptimeMillis", "()J", "setStartUptimeMillis", "(J)V", "started", "Landroidx/lifecycle/LiveData;", "getStarted", "()Landroidx/lifecycle/LiveData;", "time", "", "getTime", "timeMillis", "getTimeMillis", "()Landroidx/lifecycle/MutableLiveData;", "setTimeMillis", "(Landroidx/lifecycle/MutableLiveData;)V", "clear", "", "init", "startOrPause", "start", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.android.pictureinpicture.usecase.SystemClockWrapper systemClockWrapper = null;
    private final com.example.android.pictureinpicture.repository.TimerRepository timerRepository = null;
    private kotlinx.coroutines.Job job;
    private long startUptimeMillis;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Long> timeMillis;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _started = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> started = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> time = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.android.pictureinpicture.usecase.SystemClockWrapper systemClockWrapper, @org.jetbrains.annotations.NotNull
    com.example.android.pictureinpicture.repository.TimerRepository timerRepository) {
        super();
    }
    
    public final long getStartUptimeMillis() {
        return 0L;
    }
    
    public final void setStartUptimeMillis(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getTimeMillis() {
        return null;
    }
    
    public final void setTimeMillis(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStarted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getTime() {
        return null;
    }
    
    public final void init() {
    }
    
    /**
     * Starts the stopwatch if it is not yet started, or pauses it if it is already started.
     */
    public final void startOrPause() {
    }
    
    private final java.lang.Object start(kotlinx.coroutines.CoroutineScope $this$start, kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * Clears the stopwatch to 00:00:00.
     */
    public final void clear() {
    }
}