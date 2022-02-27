package ru.vdv.myendlesslist.domain

import com.google.gson.annotations.SerializedName

data class RedditPost(
    @SerializedName("name")
    val name: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("score")
    val score: Int,
    @SerializedName("author")
    val author: String,
    @SerializedName("subreddit") // this seems mutable but fine for a demo
    val subreddit: String,
    @SerializedName("num_comments")
    val num_comments: Int,
    @SerializedName("created_utc")
    val created: Long,
    val thumbnail: String?,
    val url: String?
) {
    // Для сохранения порядка работы сервера
    var indexInResponse: Int = -1
}
