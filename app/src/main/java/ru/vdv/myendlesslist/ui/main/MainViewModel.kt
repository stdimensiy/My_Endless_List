package ru.vdv.myendlesslist.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.vdv.myendlesslist.domain.CallBack
import ru.vdv.myendlesslist.domain.ListingData
import ru.vdv.myendlesslist.domain.RedditChildrenResponse
import ru.vdv.myendlesslist.domain.RedditPost
import ru.vdv.myendlesslist.ui.common.BaseViewModel

class MainViewModel : BaseViewModel() {
    private val mPostList = MutableLiveData<List<RedditChildrenResponse>>().apply {
        value = listOf()
    }
    val postList: LiveData<List<RedditChildrenResponse>> = mPostList

    fun fetchListRedditPost(standardList: String = "", page: Int = 0) {
        val subreddit = "androiddev"
        val limit = 90
        val after:  String? = null
        val  before: String? = null
        repository.getTopList(subreddit, limit, after, before, object: CallBack<ListingData> {
            override fun onResult(value: ListingData) {
                mPostList.value = value.children
            }
        })
    }
}