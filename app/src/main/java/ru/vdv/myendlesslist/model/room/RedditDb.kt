package ru.vdv.myendlesslist.model.room

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.vdv.myendlesslist.domain.RedditPost
import ru.vdv.myendlesslist.model.api.RedditPostDao

/**
 * Database schema used by the DbRedditPostRepository
 */
@Database(
    entities = [RedditPost::class],
    version = 1,
    exportSchema = false
)
abstract class RedditDb() : RoomDatabase() {
    abstract fun posts(): RedditPostDao
}