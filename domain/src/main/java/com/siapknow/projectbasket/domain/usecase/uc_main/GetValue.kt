package com.siapknow.projectbasket.domain.usecase.uc_main

import com.siapknow.projectbasket.domain.entity.FlashCard
import com.siapknow.projectbasket.domain.usecase.uc_nihongo.GetFlashCardDetail
import javax.inject.Inject

class GetValue @Inject constructor(private val getFlashCardDetail: GetFlashCardDetail) {

    operator fun invoke(id: Int): FlashCard {
        return getFlashCardDetail(id)
    }
}