package ru.vdv.myendlesslist.model.repository

import retrofit2.Call
import retrofit2.Response
import ru.vdv.myendlesslist.domain.CallBack
import ru.vdv.myendlesslist.domain.ListingData
import ru.vdv.myendlesslist.domain.ListingResponse
import ru.vdv.myendlesslist.model.api.RedditApi
import ru.vdv.myendlesslist.model.retrofit.Common

class Repository : IRepository {
    private val networkService: RedditApi = Common.retrofitService
    override fun getTopList(
        subreddit: String,
        limit: Int,
        after: String?,
        before: String?,
        callBack: CallBack<ListingData>
    ) {
        networkService.getTop(subreddit, limit, after, before)
            .enqueue(object : retrofit2.Callback<ListingResponse> {
                override fun onResponse(
                    call: Call<ListingResponse>,
                    response: Response<ListingResponse>
                ) {
                    response.body()?.let { callBack.onResult(it.data) }
                }

                override fun onFailure(call: Call<ListingResponse>, t: Throwable) {
                    TODO("Not yet implemented")
                }
            })
    }
}