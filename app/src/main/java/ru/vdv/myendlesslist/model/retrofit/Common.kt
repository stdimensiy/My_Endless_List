package ru.vdv.myendlesslist.model.retrofit

import ru.vdv.myendlesslist.model.api.RedditApi

object Common {
    private const val BASE_URL = "https://www.reddit.com/"

    val retrofitService: RedditApi
        get() {
            return RetrofitClient.getClient(BASE_URL)
                .create(RedditApi::class.java)
        }
}