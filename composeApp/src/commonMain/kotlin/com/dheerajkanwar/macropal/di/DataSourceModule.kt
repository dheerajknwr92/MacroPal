package com.dheerajkanwar.macropal.di

import com.dheerajkanwar.macropal.db.FoodDataSource
import org.koin.dsl.module

val foodDataSourceModule = module {
    single { FoodDataSource(get()) }
}