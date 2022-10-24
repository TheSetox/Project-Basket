package com.siapknow.projectbasket.fakedata

import android.util.Log
import com.siapknow.projectbasket.domain.entity.Category
import com.siapknow.projectbasket.domain.entity.FlashCard
import com.siapknow.projectbasket.domain.repository.NihongoRepository
import javax.inject.Inject

class NihongoDataRepository @Inject constructor() : NihongoRepository {

    override fun getCategories(): List<Category> {
        val list = mutableListOf<Category>()
        for (num in 1..10) {
            val category = Category(num, "category title $num")
            list.add(category)
        }
        return list.also {
            Log.d(TAG, "getCategories: $it")
        }
    }

    override fun getFlashCardList(): List<FlashCard> {
        val list = mutableListOf<FlashCard>()
        for (num in 1..10) {

            val title = "flash card title $num"
            val flashCard = FlashCard(
                id = num,
                categoryId = num,
                title = title,
                value = Pair(title.uppercase(), title.reversed())
            )
            list.add(flashCard)
        }
        return list.also {
            Log.d(TAG, "getFlashCardList: $it")
        }
    }

    override fun getFlashCardList(categoryId: Int): List<FlashCard> {
        val list = mutableListOf<FlashCard>()
        for (num in 1..10) {

            val title = "flash card title $num"
            val flashCard = FlashCard(
                id = num,
                categoryId = categoryId,
                title = title,
                value = Pair(title.uppercase(), title.reversed())
            )
            list.add(flashCard)
        }
        return list.also {
            Log.d(TAG, "getFlashCardList: $it")
        }
    }

    override fun getFlashCardDetail(id: Int): FlashCard {
        val title = "flash card title $id"
        return FlashCard(
            id = id,
            categoryId = id,
            title = title,
            value = Pair(title.uppercase(), title.reversed())
        ).also {
            Log.d(TAG, "getFlashCardDetail: $it")
        }
    }

    override fun createFlashCard(flashCard: FlashCard) {
        Log.d(TAG, "createFlashCard: $flashCard")
    }

    override fun createCategory(category: Category) {
        Log.d(TAG, "createCategory: $category")
    }

    companion object {
        private const val TAG = "FakeNihongoDataRepository"
    }
}