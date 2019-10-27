package com.example.myapplication.account

class HeaderItem(val date: String) : ListItem() {
    override val type: Int
        get() = TYPE_HEADER
}