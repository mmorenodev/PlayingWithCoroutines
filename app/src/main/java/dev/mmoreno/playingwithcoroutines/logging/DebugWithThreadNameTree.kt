package dev.mmoreno.playingwithcoroutines.logging

import timber.log.Timber

class DebugWithThreadNameTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String {
        return "${Thread.currentThread().name} - ${super.createStackElementTag(element)}:${element.lineNumber}"
    }
}