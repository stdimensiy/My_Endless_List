package ru.vdv.myendlesslist.model.api

import androidx.paging.DataSource
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.vdv.myendlesslist.domain.RedditPost


interface RedditPostDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(posts : List<RedditPost>)

    @Query("SELECT * FROM posts WHERE subreddit = :subreddit ORDER BY indexInResponse ASC")
    fun postsBySubreddit(subreddit : String) : DataSource.Factory<Int, RedditPost>

    @Query("DELETE FROM posts WHERE subreddit = :subreddit")
    fun deleteBySubreddit(subreddit: String)

    @Query("SELECT MAX(indexInResponse) + 1 FROM posts WHERE subreddit = :subreddit")
    fun getNextIndexInSubreddit(subreddit: String) : Int
}