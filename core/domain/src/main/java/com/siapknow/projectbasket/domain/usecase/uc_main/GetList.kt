package com.siapknow.projectbasket.domain.usecase.uc_main

import com.siapknow.projectbasket.domain.entity.Category
import com.siapknow.projectbasket.domain.entity.FlashCard
import com.siapknow.projectbasket.domain.usecase.uc_nihongo.GetAllFlashCard
import com.siapknow.projectbasket.domain.usecase.uc_nihongo.GetCategories
import com.siapknow.projectbasket.domain.usecase.uc_nihongo.GetFlashCardList
import javax.inject.Inject

class GetList @Inject constructor(
    private val getCategories: GetCategories,
    private val getAllFlashCard: GetAllFlashCard,
    private val getFlashCardList: GetFlashCardList
) {

    /**
     * Primary default for invoke is to get the list of categories.
     */
    operator fun invoke(): List<Category> {
        return getCategories()
    }

    /**
     * Get a list of Flash card list when category is selected.
     *
     * @param categoryId is the identifier to get a list of flash card.
     */
    operator fun invoke(categoryId: Int): List<FlashCard> {
        return when (categoryId) {
            NO_CATEGORY -> getAllFlashCard()
            else -> getFlashCardList(categoryId)
        }
    }

    companion object {
        private const val NO_CATEGORY = -1
    }
}