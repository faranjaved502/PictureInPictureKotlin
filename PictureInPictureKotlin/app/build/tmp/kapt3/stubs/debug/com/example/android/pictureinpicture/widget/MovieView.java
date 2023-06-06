package com.example.android.pictureinpicture.widget;

import java.lang.System;

/**
 * Provides video playback. There is nothing directly related to Picture-in-Picture here.
 *
 * This is similar to [android.widget.VideoView], but it comes with a custom control
 * (play/pause, fast forward, and fast rewind).
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 @2\u00020\u0001:\u0003@ABB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010(\u001a\u00020)H\u0002J\r\u0010*\u001a\u00020)H\u0000\u00a2\u0006\u0002\b+J\b\u0010\u000b\u001a\u00020)H\u0002J\b\u0010\r\u001a\u00020)H\u0002J\u0006\u0010,\u001a\u00020\u0007J\u0006\u0010-\u001a\u00020\u0007J\u0006\u0010.\u001a\u00020)J\b\u0010/\u001a\u00020)H\u0014J\u0018\u00100\u001a\u00020)2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0014J\u0015\u00103\u001a\u00020)2\u0006\u00104\u001a\u000205H\u0000\u00a2\u0006\u0002\b6J\u0006\u00107\u001a\u00020)J\u0006\u00108\u001a\u00020)J\u000e\u00109\u001a\u00020)2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010:\u001a\u00020)2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0012\u0010;\u001a\u00020)2\b\b\u0001\u0010<\u001a\u00020\u0007H\u0002J\u0006\u0010=\u001a\u00020)J\u0006\u0010>\u001a\u00020)J\b\u0010&\u001a\u00020)H\u0002J\b\u0010?\u001a\u00020)H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\'\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/example/android/pictureinpicture/widget/MovieView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adjustViewBounds", "", "fastForward", "Landroid/widget/ImageButton;", "fastRewind", "isPlaying", "()Z", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer$app_debug", "()Landroid/media/MediaPlayer;", "setMediaPlayer$app_debug", "(Landroid/media/MediaPlayer;)V", "minimize", "movieListener", "Lcom/example/android/pictureinpicture/widget/MovieView$MovieListener;", "savedCurrentPosition", "shade", "Landroid/view/View;", "surfaceView", "Landroid/view/SurfaceView;", "timeoutHandler", "Lcom/example/android/pictureinpicture/widget/MovieView$TimeoutHandler;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "toggle", "videoResourceId", "adjustToggleState", "", "closeVideo", "closeVideo$app_debug", "getCurrentPosition", "getVideoResourceId", "hideControls", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "openVideo", "surface", "Landroid/view/Surface;", "openVideo$app_debug", "pause", "play", "setAdjustViewBounds", "setMovieListener", "setVideoResourceId", "id", "showControls", "startVideo", "toggleControls", "Companion", "MovieListener", "TimeoutHandler", "app_debug"})
public final class MovieView extends android.widget.RelativeLayout {
    @org.jetbrains.annotations.NotNull
    public static final com.example.android.pictureinpicture.widget.MovieView.Companion Companion = null;
    private static final java.lang.String TAG = "MovieView";
    
    /**
     * The amount of time we are stepping forward or backward for fast-forward and fast-rewind.
     */
    private static final int FAST_FORWARD_REWIND_INTERVAL = 5000;
    
    /**
     * The amount of time until we fade out the controls.
     */
    private static final long TIMEOUT_CONTROLS = 3000L;
    
    /**
     * Shows the video playback.
     */
    private final android.view.SurfaceView surfaceView = null;
    private final android.widget.ImageButton toggle = null;
    private final android.view.View shade = null;
    private final android.widget.ImageButton fastForward = null;
    private final android.widget.ImageButton fastRewind = null;
    private final android.widget.ImageButton minimize = null;
    
    /**
     * This plays the video. This will be null when no video is set.
     */
    @org.jetbrains.annotations.Nullable
    private android.media.MediaPlayer mediaPlayer;
    
    /**
     * The resource ID for the video to play.
     */
    @androidx.annotation.RawRes
    private int videoResourceId = 0;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title = "";
    
    /**
     * Whether we adjust our view bounds or we fill the remaining area with black bars
     */
    private boolean adjustViewBounds = false;
    
    /**
     * Handles timeout for media controls.
     */
    private com.example.android.pictureinpicture.widget.MovieView.TimeoutHandler timeoutHandler;
    
    /**
     * The listener for all the events we publish.
     */
    private com.example.android.pictureinpicture.widget.MovieView.MovieListener movieListener;
    private int savedCurrentPosition = 0;
    
    @kotlin.jvm.JvmOverloads
    public MovieView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public MovieView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public MovieView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.media.MediaPlayer getMediaPlayer$app_debug() {
        return null;
    }
    
    public final void setMediaPlayer$app_debug(@org.jetbrains.annotations.Nullable
    android.media.MediaPlayer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override
    protected void onDetachedFromWindow() {
    }
    
    /**
     * The raw resource id of the video to play.
     *
     * @return ID of the video resource.
     */
    public final int getVideoResourceId() {
        return 0;
    }
    
    /**
     * Sets the listener to monitor movie events.
     *
     * @param movieListener The listener to be set.
     */
    public final void setMovieListener(@org.jetbrains.annotations.Nullable
    com.example.android.pictureinpicture.widget.MovieView.MovieListener movieListener) {
    }
    
    /**
     * Sets the raw resource ID of video to play.
     *
     * @param id The raw resource ID.
     */
    private final void setVideoResourceId(@androidx.annotation.RawRes
    int id) {
    }
    
    public final void setAdjustViewBounds(boolean adjustViewBounds) {
    }
    
    /**
     * Shows all the controls.
     */
    public final void showControls() {
    }
    
    /**
     * Hides all the controls.
     */
    public final void hideControls() {
    }
    
    /**
     * Fast-forward the video.
     */
    private final void fastForward() {
    }
    
    /**
     * Fast-rewind the video.
     */
    private final void fastRewind() {
    }
    
    /**
     * Returns the current position of the video. If the the player has not been created, then
     * assumes the beginning of the video.
     *
     * @return The current position of the video.
     */
    public final int getCurrentPosition() {
        return 0;
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    public final void play() {
    }
    
    public final void pause() {
    }
    
    public final void openVideo$app_debug(@org.jetbrains.annotations.NotNull
    android.view.Surface surface) {
    }
    
    /**
     * Restarts playback of the video.
     */
    public final void startVideo() {
    }
    
    public final void closeVideo$app_debug() {
    }
    
    private final void toggle() {
    }
    
    private final void toggleControls() {
    }
    
    private final void adjustToggleState() {
    }
    
    /**
     * Monitors all events related to [MovieView].
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/pictureinpicture/widget/MovieView$MovieListener;", "", "()V", "onMovieMinimized", "", "onMovieStarted", "onMovieStopped", "app_debug"})
    public static abstract class MovieListener {
        
        public MovieListener() {
            super();
        }
        
        /**
         * Called when the video is started or resumed.
         */
        public void onMovieStarted() {
        }
        
        /**
         * Called when the video is paused or finished.
         */
        public void onMovieStopped() {
        }
        
        /**
         * Called when this view should be minimized.
         */
        public void onMovieMinimized() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/android/pictureinpicture/widget/MovieView$TimeoutHandler;", "Landroid/os/Handler;", "view", "Lcom/example/android/pictureinpicture/widget/MovieView;", "(Lcom/example/android/pictureinpicture/widget/MovieView;)V", "movieViewRef", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "Companion", "app_debug"})
    static final class TimeoutHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<com.example.android.pictureinpicture.widget.MovieView> movieViewRef = null;
        @org.jetbrains.annotations.NotNull
        public static final com.example.android.pictureinpicture.widget.MovieView.TimeoutHandler.Companion Companion = null;
        public static final int MESSAGE_HIDE_CONTROLS = 1;
        
        public TimeoutHandler(@org.jetbrains.annotations.NotNull
        com.example.android.pictureinpicture.widget.MovieView view) {
            super();
        }
        
        @java.lang.Override
        public void handleMessage(@org.jetbrains.annotations.NotNull
        android.os.Message msg) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/pictureinpicture/widget/MovieView$TimeoutHandler$Companion;", "", "()V", "MESSAGE_HIDE_CONTROLS", "", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/android/pictureinpicture/widget/MovieView$Companion;", "", "()V", "FAST_FORWARD_REWIND_INTERVAL", "", "TAG", "", "TIMEOUT_CONTROLS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}