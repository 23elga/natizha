package com.natizha.smklpi

import android.icu.text.CaseMap
import android.media.Image
import android.media.MediaDescription
import android.media.Rating
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieModel(

    var title: String? = null,

    var rating: Int? = null,

    var image: String? = null,

    var  description: String? = null

): Parcelable