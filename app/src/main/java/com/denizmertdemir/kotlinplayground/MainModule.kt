package com.denizmertdemir.kotlinplayground

import android.content.Context
import androidx.hilt.lifecycle.ViewModelFactoryModules
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("valueFromActivityModule")
    fun provideValueFromStringResources(
        @ApplicationContext context: Context,
        @Named("TestString") testString1: String
    ) = "${context.getString(R.string.dependency_from_strings)} - $testString1"

}