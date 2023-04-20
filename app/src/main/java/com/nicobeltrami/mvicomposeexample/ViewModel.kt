package com.nicobeltrami.mvicomposeexample

import com.nicobeltrami.mvicomposeexample.base.BaseViewModelContract
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewModel : BaseViewModelContract {

    private val _state = MutableStateFlow(ViewState.Content(""))
    override val state: StateFlow<ViewState> = _state.asStateFlow()

    override fun event(event: ViewEvent) {
        when (event) {
            is ViewEvent.OnFavoriteClicked -> TODO()
        }
    }
}