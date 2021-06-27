package com.kodluyoruz.advancedviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var adoptButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        addListeners()
    }

    private fun initViews() {
        adoptButton = findViewById(R.id.adoptionButton)
    }

    private fun addListeners() {
        adoptButton.setOnClickListener {
            navigateToDetail("Chivas")
        }
    }

    private fun navigateToDetail(petId: String) {
        val intentDetail = Intent(this, DetailActivity::class.java)
        intentDetail.putExtra(PET_ID, petId)
        startActivity(intentDetail)
    }

    companion object {
        const val PET_ID = "com.kodluyoruz.advancedviews.PET_ID"
    }
}