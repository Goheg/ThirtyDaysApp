package com.example.thirtydaysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DayTips(
    @StringRes val streak: Int,
    @StringRes val tasks: Int,
    @DrawableRes val imageTask: Int,
    @StringRes val descriptionRes: Int
)

val dayTips = listOf(
    DayTips(
        streak = ,
        tasks =
    )
)