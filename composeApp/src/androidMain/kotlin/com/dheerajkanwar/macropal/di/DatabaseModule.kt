package com.dheerajkanwar.macropal.di

import com.dheerajkanwar.macropal.MacroPalDatabase
import com.dheerajkanwar.macropal.db.DatabaseDriverFactory
import org.koin.dsl.module

val databaseDriverFactory = module {
    factory {
        DatabaseDriverFactory(get()).createDriver()
    }
}

val databaseModule = module {
    single {
        MacroPalDatabase.invoke(get())
    }
}