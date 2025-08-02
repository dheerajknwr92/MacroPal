package com.dheerajkanwar.macropal

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform