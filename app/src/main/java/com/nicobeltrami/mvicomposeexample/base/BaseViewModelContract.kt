package com.nicobeltrami.mvicomposeexample.base

import com.nicobeltrami.mvicomposeexample.ViewEvent
import com.nicobeltrami.mvicomposeexample.ViewState

interface BaseViewModelContract : UnidirectionalViewModel<ViewState, ViewEvent>