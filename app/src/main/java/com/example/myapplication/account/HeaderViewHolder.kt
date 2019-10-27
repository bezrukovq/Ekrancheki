package com.example.myapplication.account

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.header_item.view.*

class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(headerItem: HeaderItem) {
        itemView.title.text = headerItem.date
    }

}
