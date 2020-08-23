package com.example.wheeloftheblurst

data class MovieData (
    val results: List<Result>
)

data class Result(
    val id: Int,
    val title: String,
    val overview: String,
    val poster_path: String,
    val release_Date: String,
    val vote_average: Double,
    val vote_count: Int
  //  val logo_path: String
)