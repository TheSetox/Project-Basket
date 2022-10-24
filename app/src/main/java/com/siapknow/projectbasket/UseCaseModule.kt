package com.siapknow.projectbasket

import com.siapknow.projectbasket.data.NihongoDataRepository
import com.siapknow.projectbasket.domain.repository.NihongoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    abstract fun bindNihongoRepository(
        nihongoDataRepository: NihongoDataRepository
    ): NihongoRepository
}