package org.nhathuy.kotlinplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform