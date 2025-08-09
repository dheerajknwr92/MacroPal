package com.dheerajkanwar.macropal.di

import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        databaseModule
    }.koin
}