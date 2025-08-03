package com.dheerajkanwar.macropal.data.local

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.dheerajkanwar.macropal.MacroPalDatabase

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(MacroPalDatabase.Schema, "MacroPalDatabase.db")
    }
}