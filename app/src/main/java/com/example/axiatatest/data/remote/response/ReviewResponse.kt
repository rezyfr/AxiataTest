package com.example.axiatatest.data.remote.response

import com.example.axiatatest.data.model.Review

data class ReviewResponse(
    val id: Int? = null,
    val page: Int? = null,
    var results: List<Review>? = null,
    val total_pages: Int? = null,
    val total_results: Int? = null
)