package com.den.consumeapi

import android.app.Application
import com.den.consumeapi.repository.AppContainer
import com.den.consumeapi.repository.KontakContainer

class KontakAplikation : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}