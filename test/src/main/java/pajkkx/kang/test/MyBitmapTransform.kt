package pajkkx.kang.test

import android.graphics.Bitmap
import android.util.Log
import com.bumptech.glide.Logger
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import java.security.MessageDigest

class MyBitmapTransform: BitmapTransformation() {
    override fun updateDiskCacheKey(messageDigest: MessageDigest) {
        TODO("Not yet implemented")
    }

    override fun transform(pool: BitmapPool, toTransform: Bitmap, outWidth: Int, outHeight: Int): Bitmap {
        Logger.i("MyTransform","transform","toTrans = $toTransform, outWidth = $outWidth, outHeight = $outHeight")
        return toTransform
    }

    override fun toString(): String {
        return "MyBitmapTransformation"
    }
}