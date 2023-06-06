package com.example.android.pictureinpicture;

import java.lang.System;

/**
 * Demonstrates usage of Picture-in-Picture mode on phones and tablets.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/example/android/pictureinpicture/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/android/pictureinpicture/databinding/MainActivityBinding;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "viewModel", "Lcom/example/android/pictureinpicture/MainViewModel;", "getViewModel", "()Lcom/example/android/pictureinpicture/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createRemoteAction", "Landroid/app/RemoteAction;", "iconResId", "", "titleResId", "requestCode", "controlType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "", "newConfig", "Landroid/content/res/Configuration;", "updatePictureInPictureParams", "Landroid/app/PictureInPictureParams;", "started", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.android.pictureinpicture.databinding.MainActivityBinding binding;
    
    /**
     * A [BroadcastReceiver] for handling action items on the picture-in-picture mode.
     */
    private final android.content.BroadcastReceiver broadcastReceiver = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.android.pictureinpicture.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    /**
     * Updates the parameters of the picture-in-picture mode for this activity based on the current
     * [started] state of the stopwatch.
     */
    private final android.app.PictureInPictureParams updatePictureInPictureParams(boolean started) {
        return null;
    }
    
    /**
     * Creates a [RemoteAction]. It is used as an action icon on the overlay of the
     * picture-in-picture mode.
     */
    private final android.app.RemoteAction createRemoteAction(@androidx.annotation.DrawableRes
    int iconResId, @androidx.annotation.StringRes
    int titleResId, int requestCode, int controlType) {
        return null;
    }
}