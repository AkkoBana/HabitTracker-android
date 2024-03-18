package com.akkobana.habittracker.di

import com.akkobana.habittracker.data.local.sharedpref.account.AccountPrefImpl
import com.akkobana.habittracker.data.repository.LocalRepositoryImpl
import com.akkobana.habittracker.data.repository.NetworkRepositoryImpl
import com.akkobana.habittracker.domain.repository.LocalRepository
import com.akkobana.habittracker.domain.repository.NetworkRepository
import org.koin.dsl.module

val dataModule = module {
    single<NetworkRepository> {
        NetworkRepositoryImpl(get())
    }

    single { AccountPrefImpl(context = get()) }

    single<LocalRepository> {
        LocalRepositoryImpl(get(), get())
    }
}