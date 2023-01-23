package com.siapknow.projectbasket.domain.usecase.uc_nihongo

import com.siapknow.projectbasket.domain.entity.Category
import com.siapknow.projectbasket.domain.repository.NihongoRepository
import javax.inject.Inject

class CreateCategory @Inject constructor(private val repository: NihongoRepository) {

    operator fun invoke(category: Category) {
        repository.createCategory(category)
    }
}