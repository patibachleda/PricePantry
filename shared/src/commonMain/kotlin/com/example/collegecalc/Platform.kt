package com.example.collegecalc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform