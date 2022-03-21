package ru.vdv.myendlesslist.domain

interface CallBack<T> {
    fun onResult(value: T)
}