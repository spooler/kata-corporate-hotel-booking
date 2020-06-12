package com.kata.domain.hotel

interface Hotels {
    fun add(hotel: Hotel)
    fun findById(hotelId: Int): Hotel?
}
