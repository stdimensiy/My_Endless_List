package ru.vdv.myendlesslist.domain

/**
 * Класс данных (ПОСТ)
 * В базовом ответе более 100 полей, в данной работе приняты только некоторые (которые нужны)
 */
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "posts",
    indices = [Index(value = ["subreddit"], unique = false)])
data class RedditPost(
    @PrimaryKey
    @SerializedName("name")
    val name: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("score")
    val score: Int,
    @SerializedName("author")
    val author: String,
    @SerializedName("subreddit") // this seems mutable but fine for a demo
    @ColumnInfo(collate = ColumnInfo.NOCASE)
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
