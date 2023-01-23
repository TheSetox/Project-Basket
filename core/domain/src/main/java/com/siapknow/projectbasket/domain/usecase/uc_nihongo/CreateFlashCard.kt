package com.siapknow.projectbasket.domain.usecase.uc_nihongo

import com.siapknow.projectbasket.domain.entity.FlashCard
import com.siapknow.projectbasket.domain.repository.NihongoRepository
import javax.inject.Inject

class CreateFlashCard @Inject constructor(private val repository: NihongoRepository) {

    operator fun invoke(flashCard: FlashCard) {
        repository.createFlashCard(flashCard)
    }
}