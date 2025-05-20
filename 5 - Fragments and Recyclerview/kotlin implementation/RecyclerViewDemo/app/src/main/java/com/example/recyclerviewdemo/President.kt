package com.example.recyclerviewdemo

import androidx.annotation.DrawableRes

data class President(
    val name: String,
    val order: String,
    @DrawableRes val portrait: Int
)
