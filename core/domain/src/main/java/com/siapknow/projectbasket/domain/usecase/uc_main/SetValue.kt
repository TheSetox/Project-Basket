package com.siapknow.projectbasket.domain.usecase.uc_main

import com.siapknow.projectbasket.domain.entity.Category
import com.siapknow.projectbasket.domain.entity.FlashCard
import com.siapknow.projectbasket.domain.usecase.uc_nihongo.CreateCategory
import com.siapknow.projectbasket.domain.usecase.uc_nihongo.CreateFlashCard
import javax.inject.Inject

class SetValue @Inject constructor(
    private val createFlashCard: CreateFlashCard,
    private val createCategory: CreateCategory
) {

    operator fun invoke(flashCard: FlashCard) {
        return createFlashCard(flashCard)
    }

    operator fun invoke(category: Category) {
        return createCategory(category)
    }
}