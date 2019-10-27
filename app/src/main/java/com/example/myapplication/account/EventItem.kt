package com.example.myapplication.account


class EventItem(val title: String, val money: Int) : ListItem() {
    override val type: Int
        get() = TYPE_EVENT
}
