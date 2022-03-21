package ru.vdv.myendlesslist.model.repository

import ru.vdv.myendlesslist.domain.CallBack
import ru.vdv.myendlesslist.domain.ListingData

interface IRepository {
    fun getTopList(
        subreddit: String,
        limit: Int,
        after: String?,
        before: String?,
        callBack: CallBack<ListingData>
    )
}