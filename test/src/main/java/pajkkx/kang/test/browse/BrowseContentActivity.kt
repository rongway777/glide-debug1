package pajkkx.kang.test.browse

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pajkkx.kang.test.R

class BrowseContentActivity : AppCompatActivity() {
    private var rootPath:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse_content)

        rootPath = intent.getStringExtra("rootPath")



    }

    companion object{
        fun start(context: Context, rootPath: String){
            val intent = Intent(context, BrowseContentActivity::class.java)
            intent.putExtra("rootPath",rootPath)
            context.startActivity(intent)
        }
    }
}