package com.example.telegram_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telegram_clone.Controller.Rv_Adapter
import com.example.telegram_clone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    var data = arrayOf(
        "Pradyuman",
        "Deep Mehta",
        "Democratic Party Of Rnw",
        "Zenish",
        "+91 8849941661",
        "Kartik",
        "Abhishek N",
        "Sumedh Bhai",
        "Jignesh (Office)",
        "Arif S",
        "+91 9727352050",
        "Rupesh Rnw"
    )
    var photo = arrayOf(
        R.drawable.photo1,
        R.drawable.photo2,
        R.drawable.photo3,
        R.drawable.photo4,
        R.drawable.photo2,
        R.drawable.photo4,
        R.drawable.photo5,
        R.drawable.photo2,
        R.drawable.photo4,
        R.drawable.photo5,
        R.drawable.photo2,
        R.drawable.photo1,
        R.drawable.photo5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Adapter()

        binding.menuBtn.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

    }

    fun Adapter() {

        var adapter1 = Rv_Adapter(this, data, photo)
        var layoutManager1 = LinearLayoutManager(this)
        binding.rvView.layoutManager = layoutManager1
        binding.rvView.adapter = adapter1

    }

}