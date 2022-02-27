package ru.vdv.myendlesslist.domain

import com.google.gson.annotations.SerializedName

/**
 * Класс собственно набора данных
 * @property after         ...
 * @property dist          ...
 * @property modHash       ...
 * @property geoFilter     ...
 * @property children      список дочених элементов (собственно постов)
 * @property before        ...
 */
class ListingData(
    val after: String?,
    val dist: Int,
    @SerializedName("modhash")
    val modHash: String = "",
    @SerializedName("geo_filter")
    val geoFilter: String?,
    val children: List<RedditChildrenResponse>,
    val before: String?
)