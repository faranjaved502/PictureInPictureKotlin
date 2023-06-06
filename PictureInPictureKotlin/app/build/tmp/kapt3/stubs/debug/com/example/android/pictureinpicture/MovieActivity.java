package com.example.android.pictureinpicture;

import java.lang.System;

/**
 * Demonstrates usage of Picture-in-Picture when using [MediaSessionCompat].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0014J\b\u0010\u0018\u001a\u00020\nH\u0014J\b\u0010\u0019\u001a\u00020\nH\u0014J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J \u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002J(\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/android/pictureinpicture/MovieActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/android/pictureinpicture/databinding/MovieActivityBinding;", "movieListener", "Lcom/example/android/pictureinpicture/widget/MovieView$MovieListener;", "session", "Landroid/support/v4/media/session/MediaSessionCompat;", "adjustFullScreen", "", "config", "Landroid/content/res/Configuration;", "initializeMediaSession", "minimize", "onConfigurationChanged", "newConfig", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "", "onRestart", "onStart", "onStop", "onWindowFocusChanged", "hasFocus", "updatePictureInPictureParams", "Landroid/app/PictureInPictureParams;", "updatePlaybackState", "state", "", "position", "mediaId", "playbackActions", "", "Companion", "MediaSessionCallback", "app_debug"})
public final class MovieActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    public static final com.example.android.pictureinpicture.MovieActivity.Companion Companion = null;
    private static final java.lang.String TAG = "MediaSessionPlaybackActivity";
    private static final long MEDIA_ACTIONS_PLAY_PAUSE = 518L;
    private static final long MEDIA_ACTIONS_ALL = 566L;
    private static final int PLAYLIST_SIZE = 2;
    private com.example.android.pictureinpicture.databinding.MovieActivityBinding binding;
    private android.support.v4.media.session.MediaSessionCompat session;
    
    /**
     * Callbacks from the [MovieView] showing the video playback.
     */
    private final com.example.android.pictureinpicture.widget.MovieView.MovieListener movieListener = null;
    
    public MovieActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    private final void initializeMediaSession() {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    @java.lang.Override
    protected void onRestart() {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    @java.lang.Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    private final android.app.PictureInPictureParams updatePictureInPictureParams() {
        return null;
    }
    
    /**
     * Enters Picture-in-Picture mode.
     */
    private final void minimize() {
    }
    
    /**
     * Adjusts immersive full-screen flags depending on the screen orientation.
     *
     * @param config The current [Configuration].
     */
    private final void adjustFullScreen(android.content.res.Configuration config) {
    }
    
    /**
     * Overloaded method that persists previously set media actions.
     *
     * @param state The state of the video, e.g. playing, paused, etc.
     * @param position The position of playback in the video.
     * @param mediaId The media id related to the video in the media session.
     */
    private final void updatePlaybackState(@android.support.v4.media.session.PlaybackStateCompat.State
    int state, int position, int mediaId) {
    }
    
    private final void updatePlaybackState(@android.support.v4.media.session.PlaybackStateCompat.State
    int state, long playbackActions, int position, int mediaId) {
    }
    
    /**
     * Updates the [MovieView] based on the callback actions. <br></br>
     * Simulates a playlist that will disable actions when you cannot skip through the playlist in a
     * certain direction.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/android/pictureinpicture/MovieActivity$MediaSessionCallback;", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "movieView", "Lcom/example/android/pictureinpicture/widget/MovieView;", "(Lcom/example/android/pictureinpicture/MovieActivity;Lcom/example/android/pictureinpicture/widget/MovieView;)V", "indexInPlaylist", "", "onPause", "", "onPlay", "onSkipToNext", "onSkipToPrevious", "app_debug"})
    final class MediaSessionCallback extends android.support.v4.media.session.MediaSessionCompat.Callback {
        private final com.example.android.pictureinpicture.widget.MovieView movieView = null;
        private int indexInPlaylist = 1;
        
        public MediaSessionCallback(@org.jetbrains.annotations.NotNull
        com.example.android.pictureinpicture.widget.MovieView movieView) {
            super();
        }
        
        @java.lang.Override
        public void onPlay() {
        }
        
        @java.lang.Override
        public void onPause() {
        }
        
        @java.lang.Override
        public void onSkipToNext() {
        }
        
        @java.lang.Override
        public void onSkipToPrevious() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/android/pictureinpicture/MovieActivity$Companion;", "", "()V", "MEDIA_ACTIONS_ALL", "", "MEDIA_ACTIONS_PLAY_PAUSE", "PLAYLIST_SIZE", "", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}