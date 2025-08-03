package com.dheerajkanwar.macropal.data.local

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.dheerajkanwar.macropal.MacroPalDatabase

actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(schema = MacroPalDatabase.Schema, context = context, name = "MacroPalDatabase.db")
    }
}