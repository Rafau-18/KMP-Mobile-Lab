package com.rurbaniak.kmp_mobile_app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMPMobileApp",
    ) {
        App()
    }
}