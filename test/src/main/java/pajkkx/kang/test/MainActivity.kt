package pajkkx.kang.test

import android.Manifest
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.Logger
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.ViewTarget
import java.io.File
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    val TAG = "Glide-Test"

    val sdcard = Environment.getExternalStorageDirectory().path + File.separator
    val CHA_HUA_HEAD_IMG_1 = sdcard + "Pictures/headimg/boy-5.png"
    val CHA_HUA_HEAD_IMG_2 = sdcard + "Pictures/headimg/boy-6.png"
    val CHA_HUA_HEAD_IMG_3 = sdcard + "Pictures/headimg/girl-2.png"
    val CHA_HUA_HEAD_IMG_4 = sdcard + "Pictures/headimg/girl-7.png"
    val GOOGLE_PNG_IMG_4 = sdcard + "Pictures/png/65816-television-firewatch-campo-wallpaper-desktop-4k-santo_800x800.png"
    val GOOGLE_PNG_IMG_5 = sdcard + "Pictures/png/BAq7ueY-png-wallpapers.png"
    val GOOGLE_PNG_IMG_6 = sdcard + "Pictures/png/rhS7Qoe-png-wallpapers.png"



    var img: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestReadExternalPermission()
        img = findViewById(R.id.imageView)

        Logger.i("MainActivity","onCreate()","Init RequestOptions Start")

        val ops = RequestOptions()
                .error(R.drawable.screenshot)
                .override(50,50)
                .placeholder(R.drawable.placeholder)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .transform(MyBitmapTransform())
                .downsample(DownsampleStrategy.AT_LEAST)
                .timeout(3500)
                .encodeQuality(70)
                .frame(1000 * 1000)

        Logger.i("MainActivity","onCreate()","Init RequestOptions Completed")
        Logger.line()

        Glide.with(this)
                .load(CHA_HUA_HEAD_IMG_1)
                .apply(ops)
                .into(img!!)



    }

















    private fun requestReadExternalPermission(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED){
                Log.i(TAG, "checkAndRequestWriteExternalStoragePermission(), check result = DENIED, DO REQUEST");
                requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),47);
            }else if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
                Log.i(TAG, "checkAndRequestWriteExternalStoragePermission(), check result = GRANT");
            }
        }
    }
}