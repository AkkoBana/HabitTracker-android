package com.akkobana.habittracker.di

import com.akkobana.habittracker.domain.usecases.user_usecases.GetUserToken
import com.akkobana.habittracker.domain.usecases.user_usecases.GetUserTokenImpl
import com.akkobana.habittracker.domain.usecases.user_usecases.SetUserToken
import com.akkobana.habittracker.domain.usecases.user_usecases.SetUserTokenImpl
import org.koin.dsl.module

val domainModule = module {
    factory<GetUserToken> {
        GetUserTokenImpl(get())
    }
    factory<SetUserToken> {
        SetUserTokenImpl(get())
    }
}