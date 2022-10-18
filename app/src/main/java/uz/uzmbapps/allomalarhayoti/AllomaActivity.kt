package uz.uzmbapps.allomalarhayoti

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

class AllomaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alloma)

        val getImage = intent.getIntExtra("img_key", R.drawable.ic_launcher_background)// default holatda "ic_launcher_background"
        val getStr = intent.getStringExtra("string_key")

        findViewById<ImageView>(R.id.imageView).setImageResource(getImage)
        findViewById<TextView>(R.id.textView).text = getStr.toString()

        findViewById<ImageView>(R.id.back).setOnClickListener {
            finish()
        }

    }
}