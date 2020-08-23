package com.example.wheeloftheblurst

data class MovieData (
    val results: List<Result>
)

data class Result(
    val id: Int,
    val title: String,
    val overview: String,
    val posterPath: String,
    val release_Date: String,
    val voteAverage: Double,
    val voteCount: Int
)