package ru.vdv.myendlesslist.ui.common

import androidx.lifecycle.ViewModel
import ru.vdv.myendlesslist.model.repository.Repository

abstract class BaseViewModel : ViewModel() {
    protected val TAG = "${BaseConstants.MY_TAG} / ${this.javaClass.simpleName}"
    protected val repository = Repository()
}