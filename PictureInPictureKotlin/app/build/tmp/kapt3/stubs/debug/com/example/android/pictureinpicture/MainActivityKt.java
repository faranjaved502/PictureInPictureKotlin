package com.example.android.pictureinpicture;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"ACTION_STOPWATCH_CONTROL", "", "CONTROL_TYPE_CLEAR", "", "CONTROL_TYPE_START_OR_PAUSE", "EXTRA_CONTROL_TYPE", "REQUEST_CLEAR", "REQUEST_START_OR_PAUSE", "app_debug"})
public final class MainActivityKt {
    
    /**
     * Intent action for stopwatch controls from Picture-in-Picture mode.
     */
    private static final java.lang.String ACTION_STOPWATCH_CONTROL = "stopwatch_control";
    
    /**
     * Intent extra for stopwatch controls from Picture-in-Picture mode.
     */
    private static final java.lang.String EXTRA_CONTROL_TYPE = "control_type";
    private static final int CONTROL_TYPE_CLEAR = 1;
    private static final int CONTROL_TYPE_START_OR_PAUSE = 2;
    private static final int REQUEST_CLEAR = 3;
    private static final int REQUEST_START_OR_PAUSE = 4;
}