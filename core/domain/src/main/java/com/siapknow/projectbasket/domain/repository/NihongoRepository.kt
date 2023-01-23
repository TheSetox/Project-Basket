package com.siapknow.projectbasket.domain.repository

import com.siapknow.projectbasket.domain.entity.Category
import com.siapknow.projectbasket.domain.entity.FlashCard

interface NihongoRepository {

    /**
     * Get list of categories.
     */
    fun getCategories(): List<Category>

    /**
     * Get all the list of flash card.
     */
    fun getFlashCardList(): List<FlashCard>

    /**
     * Get specific list of flash card.
     *
     * @param categoryId is an identifier to get a list of flash card.
     */
    fun getFlashCardList(categoryId: Int): List<FlashCard>

    /**
     * Get flash card detail.
     *
     * @param id is an identifier to get a specific flash card.
     */
    fun getFlashCardDetail(id: Int): FlashCard

    /**
     * Create a new flash card.
     *
     * @param flashCard is an object to be created and saved for flash card.
     */
    fun createFlashCard(flashCard: FlashCard)

    /**
     * Create a new category.
     *
     * @param category is an object to be created and saved for category.
     */
    fun createCategory(category: Category)

    //TODO Add update and delete functions
}