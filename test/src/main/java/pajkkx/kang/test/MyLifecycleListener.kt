package pajkkx.kang.test

import android.util.Log
import com.bumptech.glide.manager.LifecycleListener

class MyLifecycleListener : LifecycleListener {

    override fun onStart() {
        Log.i("Glide-Lifecycle", "My Listener onStart()")
    }

    override fun onStop() {
        Log.i("Glide-Lifecycle", "My Listener onStop()")
    }

    override fun onDestroy() {
        Log.i("Glide-Lifecycle", "My Listener onDestroy()")
    }
}