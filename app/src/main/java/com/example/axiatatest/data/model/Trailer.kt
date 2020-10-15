package com.example.axiatatest.data.model

import com.example.axiatatest.BuildConfig

data class Trailer(
    val id: String? = null,
    val key: String? = null,
    val site: String? = null,
    val size: Int? = null,
    val type: String? = null
){
    fun getYoutubeURL() =
            if (site == "YouTube") BuildConfig.YOUTUBE_URL + key else null

}