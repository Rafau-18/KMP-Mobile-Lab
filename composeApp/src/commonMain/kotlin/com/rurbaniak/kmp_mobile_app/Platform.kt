package com.rurbaniak.kmp_mobile_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform