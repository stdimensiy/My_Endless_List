package ru.vdv.myendlesslist.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.vdv.myendlesslist.domain.CallBack
import ru.vdv.myendlesslist.domain.ListingData
import ru.vdv.myendlesslist.domain.RedditChildrenResponse
import ru.vdv.myendlesslist.domain.RedditPost
import ru.vdv.myendlesslist.ui.common.BaseViewModel

class MainViewModel : BaseViewModel() {
    private var currentAfterPostName: String? = null
    private val mPostList = MutableLiveData<List<RedditChildrenResponse>>().apply {
        value = listOf()
    }
    val postList: LiveData<List<RedditChildrenResponse>> = mPostList

    fun fetchListRedditPost(
        subreddit: String = "androiddev",
        after: String? = null,
        before: String? = null,
        limit: Int = 90
    ) {
        repository.getTopList(subreddit, limit, after, before, object : CallBack<ListingData> {
            override fun onResult(value: ListingData) {
                currentAfterPostName = value.after
                mPostList.value = value.children
            }
        })
    }
}