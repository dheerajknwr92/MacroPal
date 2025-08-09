package com.dheerajkanwar.macropal.di

import com.dheerajkanwar.macropal.MacroPalDatabase
import com.dheerajkanwar.macropal.db.DatabaseDriverFactory
import org.koin.dsl.module

val databaseDriverFactory = module {
    factory {
        DatabaseDriverFactory().createDriver()
    }
}

val databaseModule = module {
    single {
        MacroPalDatabase.invoke(get())
    }
}