package ru.vdv.myendlesslist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var title: TextView = itemView.findViewById(R.id.tv_item_title)
    var ratingImage: ImageView = itemView.findViewById(R.id.iv_item_rating)
    var ratingCount: TextView = itemView.findViewById(R.id.tv_item_rating_count)
    var commentImage: ImageView  = itemView.findViewById(R.id.iv_item_comment)
    var commentCount: TextView = itemView.findViewById(R.id.tv_item_comment_count)
}