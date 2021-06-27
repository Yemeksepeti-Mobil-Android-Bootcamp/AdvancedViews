package com.kodluyoruz.advancedviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    val TAG = "DetailActivity"
    lateinit var nameTextView: TextView
    lateinit var kindTextView: TextView
    lateinit var locationTextView: TextView
    lateinit var descriptionTextView: TextView
    lateinit var likeButton: ImageButton
    lateinit var adoptButton: Button
    lateinit var contactButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
        handleIntent(intent)
        addListeners()
    }

    private fun initViews() {
        nameTextView = findViewById(R.id.nameTextView)
        kindTextView = findViewById(R.id.kindTextView)
        locationTextView = findViewById(R.id.locationTextView)
        descriptionTextView = findViewById(R.id.descriptionTextView)
        likeButton = findViewById(R.id.likeButton)
        contactButton = findViewById(R.id.contactButton)
        adoptButton = findViewById(R.id.adoptButton)
    }

    private fun handleIntent(intent: Intent?) {
        intent?.let {
            it.getStringExtra(MainActivity.PET_ID)?.let { petId ->
                Log.v(TAG, "Pet ID = $petId")
                nameTextView.text = petId
                kindTextView.text = "YorkShire"
                locationTextView.text = "Istanbul"
                descriptionTextView.text =
                    "Yorkshire teriyeri, Birleşik Krallık kökenli, küçük bir teriyer ırkı. Görüntüsüne karşın, tüm teriyerler gibi oldukça gözü pektir. Çok cesur, enerjik ve zeki bir köpektir. Ailesine çok bağlıdır. Yabancılardan hoşlanmaz, mesafeli davranır. Küçük hayvanları ve diğer köpekleri sevmez, saldırgan davranabilir."
            }
        }
    }

    private fun addListeners() {
        likeButton.setOnClickListener {
            Toast.makeText(baseContext, "Like Button", Toast.LENGTH_SHORT).show()
        }

        contactButton.setOnClickListener {
            Toast.makeText(baseContext, "Contact Button", Toast.LENGTH_SHORT).show()
        }

        adoptButton.setOnClickListener {
            Toast.makeText(baseContext, "Adopt Button", Toast.LENGTH_SHORT).show()
        }
    }

}