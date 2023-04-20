package com.nicobeltrami.mvicomposeexample

sealed interface ViewState {
    object Loading : ViewState
    data class Content(val text: String) : ViewState
    object Error : ViewState
}
