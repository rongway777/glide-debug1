package com.bumptech.glide.manager;

import android.util.Log;
import androidx.annotation.NonNull;

/** A no-op {@link com.bumptech.glide.manager.ConnectivityMonitor}. */
class NullConnectivityMonitor implements ConnectivityMonitor {

  @Override
  public void onStart() {
    Log.i("Glide-Lifecycle", "Line ==> NullConnectivityMonitor onStart()");
    // Do nothing.
  }

  @Override
  public void onStop() {
    Log.i("Glide-Lifecycle", "Line ==> NullConnectivityMonitor onStop()");
    // Do nothing.
  }

  @Override
  public void onDestroy() {
    // Do nothing.
    Log.i("Glide-Lifecycle", "Line ==> NullConnectivityMonitor onDestroy()");
  }

  @NonNull
  @Override
  public String toString() {
    return "I AM A LifecycleListener YEAH";
  }
}
