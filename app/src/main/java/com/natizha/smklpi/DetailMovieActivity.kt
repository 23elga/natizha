package com.natizha.smklpi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        val movie =
            intent.getParcelableExtra<MovieModel>("movie")

        tv_title_movie.text = movie.title
        tv_rating_movie.text = "Rating : ${movie.rating}"
        tv_description_movie.text = movie.description

    }
}
