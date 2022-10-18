package uz.uzmbapps.allomalarhayoti

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item1 = findViewById<FrameLayout>(R.id.item1)
        val item2 = findViewById<FrameLayout>(R.id.item2)

        val alisherNavoiy = "'Ali-Shir Nava'i, also known as Nizām-al-Din ʿAli-Shir Herawī was a Timurid poet, writer, statesman, linguist, Hanafi Maturidi mystic and painter who was the greatest representative of Chagatai literature. Wikipedia\n" +
                "Born: February 9, 1441, Herat, Afghanistan\n" +
                "Died: January 3, 1501, Herat, Afghanistan\n" +
                "Books: Topmadim: ghazallar, Muhakamat al-Lughatayn, MORE\n" +
                "Place of burial: Herat, Afghanistan\n" +
                "Full name: ‘Alī Shīr Navā’ī"
        val mirzoUlugbek = "Mīrzā Muhammad Tāraghay bin Shāhrukh, better known as Ulugh Beg, was a Timurid sultan, as well as an astronomer and mathematician. Ulugh Beg was notable for his work in astronomy-related mathematics, such as trigonometry and spherical geometry, as well as his general interests in the arts and intellectual activities. Wikipedia"

        item1.setOnClickListener {
            setExtraData(mirzoUlugbek, R.drawable.img_1)
        }
        item2.setOnClickListener {
            setExtraData(alisherNavoiy, R.drawable.img)
        }
    }
    private fun setExtraData(message: String, img: Int){
        val i = Intent(this, AllomaActivity::class.java)
        i.putExtra("string_key", message)
        i.putExtra("img_key", img)
        startActivity(i)
    }
}