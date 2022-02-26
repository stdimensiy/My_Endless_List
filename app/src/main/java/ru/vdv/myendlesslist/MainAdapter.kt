package ru.vdv.myendlesslist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.vdv.myendlesslist.domain.ResultListItem

class MainAdapter : RecyclerView.Adapter<MainViewHolder>() {
    var items: List<ResultListItem> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val root = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_list_item, parent, false)
        return MainViewHolder(root)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = items[position]
        holder.title.text = item.title
        holder.ratingCount.text  = item.rating.toString()
        holder.commentCount.text  = item.commentCount.toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }
}