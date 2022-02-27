package ru.vdv.myendlesslist.domain

/**
 * Класс первичного ответа сервера
 * @property kind         Намменование набора (вид ответа)
 * @property data         Содержит объект набора данных с характеристиками набора
 */
class ListingResponse(
    val kind: String,
    val data: ListingData
    )