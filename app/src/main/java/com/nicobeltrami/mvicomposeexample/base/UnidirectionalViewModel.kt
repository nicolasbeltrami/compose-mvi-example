package com.nicobeltrami.mvicomposeexample.base

import kotlinx.coroutines.flow.StateFlow

interface UnidirectionalViewModel<STATE, EVENT> {
    val state: StateFlow<STATE>
    fun event(event: EVENT)
}
