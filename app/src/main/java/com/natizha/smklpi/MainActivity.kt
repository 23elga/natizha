package com.natizha.smklpi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.coroutineScope
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_List_movie.onClick {
            //          val intent =
            //              Intent(this@MainActivity,ListMovieActivity::class.java)
            //          startActivity(intent)
            startActivity(intentFor<ListMovieActivity>())
        }

    }
}
