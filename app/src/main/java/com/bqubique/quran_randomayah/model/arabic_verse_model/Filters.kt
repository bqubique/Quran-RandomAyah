package com.bqubique.quran_randomayah.model.arabic_verse_model


import com.google.gson.annotations.SerializedName


data class Filters(
    @SerializedName("verse_key")
    val verseKey: String
)