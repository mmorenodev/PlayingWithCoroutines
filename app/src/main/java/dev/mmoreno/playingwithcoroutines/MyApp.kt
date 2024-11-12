package dev.mmoreno.playingwithcoroutines

import android.app.Application
import dev.mmoreno.playingwithcoroutines.logging.DebugWithThreadNameTree
import timber.log.Timber

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        // The app is only for learning purposes, so we always use Timber
        Timber.plant(DebugWithThreadNameTree())
    }
}