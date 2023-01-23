package com.siapknow.projectbasket.data

import android.util.Log
import com.siapknow.projectbasket.domain.entity.Category
import com.siapknow.projectbasket.domain.entity.FlashCard
import com.siapknow.projectbasket.domain.repository.NihongoRepository
import javax.inject.Inject

class NihongoDataRepository @Inject constructor(): NihongoRepository {

    override fun getCategories(): List<Category> {
        Log.d("NihongoDataRepository", "getCategories: empty debug")
        return emptyList()
    }

    override fun getFlashCardList(): List<FlashCard> {
        TODO("Not yet implemented")
    }

    override fun getFlashCardList(categoryId: Int): List<FlashCard> {
        TODO("Not yet implemented")
    }

    override fun getFlashCardDetail(id: Int): FlashCard {
        TODO("Not yet implemented")
    }

    override fun createFlashCard(flashCard: FlashCard) {
        TODO("Not yet implemented")
    }

    override fun createCategory(category: Category) {
        TODO("Not yet implemented")
    }
}