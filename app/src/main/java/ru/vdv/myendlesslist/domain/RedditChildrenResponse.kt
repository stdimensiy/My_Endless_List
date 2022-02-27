package ru.vdv.myendlesslist.domain

/**
 * Класс собственно набора данных
 * @property kind         Вид обхекта (поста t1, t2, t3, t4 или t5)
 * @property data         содержимое, объект поста
 */
data class RedditChildrenResponse(
    val kind: String,
    val data: RedditPost
    )
