package ru.vdv.myendlesslist.domain

class ListingData(
    val children: List<RedditChildrenResponse>,
    val after: String?,
    val before: String?
)