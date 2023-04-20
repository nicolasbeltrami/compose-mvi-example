package com.nicobeltrami.mvicomposeexample

sealed interface ViewEvent {
    data class OnFavoriteClicked(val id: Int) : ViewEvent
}
