package com.siapknow.projectbasket.domain.usecase.uc_nihongo

import com.siapknow.projectbasket.domain.entity.FlashCard
import com.siapknow.projectbasket.domain.repository.NihongoRepository

class GetFlashCardDetail(private val repository: NihongoRepository) {

    operator fun invoke(id: Int): FlashCard {
        return repository.getFlashCardDetail(id)
    }
}