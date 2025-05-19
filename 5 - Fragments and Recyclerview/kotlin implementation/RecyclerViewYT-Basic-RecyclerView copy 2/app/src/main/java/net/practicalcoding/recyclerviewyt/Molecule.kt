package net.practicalcoding.recyclerviewyt

import androidx.annotation.DrawableRes

data class Molecule(
    val name: String,
    val threeAbbr: String,
    val oneAbbr: String,
    @DrawableRes val structure: Int
)
