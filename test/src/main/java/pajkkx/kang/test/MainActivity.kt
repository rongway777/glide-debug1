package pajkkx.kang.test

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.io.File

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

        Log.i(TAG, "onCreate: IMG1 = $CHA_HUA_HEAD_IMG_1")
        Glide.with(this)
                .load(GOOGLE_PNG_IMG_6)
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