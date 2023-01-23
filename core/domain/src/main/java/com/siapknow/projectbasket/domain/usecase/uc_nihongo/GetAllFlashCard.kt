package com.siapknow.projectbasket.domain.usecase.uc_nihongo

import com.siapknow.projectbasket.domain.entity.FlashCard
import com.siapknow.projectbasket.domain.repository.NihongoRepository
import javax.inject.Inject

class GetAllFlashCard @Inject constructor(private val nihongoRepository: NihongoRepository) {

    operator fun invoke(): List<FlashCard> {
        return nihongoRepository.getFlashCardList()
    }
}