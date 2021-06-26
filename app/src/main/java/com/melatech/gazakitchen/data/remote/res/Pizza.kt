package com.melatech.gazakitchen.data.remote.res

data class Pizza(
    val count: Int = 0, // 7000
    val from: Int = 0, // 0
    val hits: List<Hit> = listOf(),
    val more: Boolean = false, // true
    val q: String = "", // pizza
    val to: Int = 0 // 10
)