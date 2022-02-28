package ru.vdv.myendlesslist.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.vdv.myendlesslist.R
import ru.vdv.myendlesslist.domain.OnLoadMoreData
import ru.vdv.myendlesslist.domain.RedditChildrenResponse

class MainAdapter : RecyclerView.Adapter<MainViewHolder>() {
    private var onLoadMoreDataListener: OnLoadMoreData? = null
    var items: List<RedditChildrenResponse> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val root = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_list_item, parent, false)
        return MainViewHolder(root)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = items[position]
        holder.title.text = item.data.title
        holder.ratingCount.text  = item.data.score.toString()
        holder.commentCount.text  = item.data.num_comments.toString()

        if (items.isNotEmpty() && position == items.size - 1) {
            onLoadMoreDataListener!!.onLoadMore()
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setOnLoadMoreDataListener(onLoadMoreDataListener: OnLoadMoreData) {
        this.onLoadMoreDataListener = onLoadMoreDataListener
    }
}