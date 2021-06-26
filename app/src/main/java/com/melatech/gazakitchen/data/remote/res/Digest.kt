package com.melatech.gazakitchen.data.remote.res

data class Digest(
    val daily: Double = 0.0, // 109.01311879959779
    val hasRDI: Boolean = false, // true
    val label: String = "", // Fat
    val schemaOrgTag: String = "", // fatContent
    val sub: List<Sub> = listOf(),
    val tag: String = "", // FAT
    val total: Double = 0.0, // 70.85852721973856
    val unit: String = "" // g
)