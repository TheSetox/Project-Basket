package com.siapknow.projectbasket.domain.entity

data class Category(
    val id: Int,
    val title: String
)

data class FlashCard(
    val id: Int,
    val categoryId: Int,
    val title: String,
    val value: Pair<String, String>
)