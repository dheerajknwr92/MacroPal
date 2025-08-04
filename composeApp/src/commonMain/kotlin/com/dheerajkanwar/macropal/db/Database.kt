package com.dheerajkanwar.macropal.db

import com.dheerajkanwar.macropal.MacroPalDatabase

internal class FoodSourceDataSource(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = MacroPalDatabase(databaseDriverFactory.createDriver())
    private val foodSourceQueries = database.foodSourceQueries

    fun getAllFoodSources() = foodSourceQueries.selectAll().executeAsList()

    fun getFoodSourceDetail(id: Long) = foodSourceQueries.findById(id).executeAsOne()

    fun searchFoodSource(name: String) = foodSourceQueries.findByName(name).executeAsList()

    fun addFoodSource(
        name: String,
        measureIn: Long,
        protein: Double,
        carbohydrates: Double,
        fats: Double,
    ) = foodSourceQueries.insert(
        name = name,
        measureIn = measureIn,
        protein = protein,
        carbohydrates = carbohydrates,
        fats = fats,
    )

    fun deleteFoodSource(id: Long) = foodSourceQueries.deleteById(id)
}