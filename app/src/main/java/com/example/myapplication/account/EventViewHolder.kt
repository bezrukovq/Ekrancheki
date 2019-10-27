package com.example.myapplication.account

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.transfer_item.view.*

class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(eventItem: EventItem) {
        itemView.title.text = eventItem.title
        itemView.event_money.text = eventItem.money.toString()
        if (eventItem.money > 0) {
            itemView.event_icon.setImageResource(R.drawable.income)
            itemView.event_money.setTextColor(Color.parseColor("#008577"))
        } else {
            itemView.event_icon.setImageResource(R.drawable.outcome)
            itemView.event_money.setTextColor(Color.BLACK)
        }
    }
}
