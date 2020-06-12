package com.kata.infrastructure

import com.kata.domain.hotel.Hotel
import com.kata.domain.hotel.Hotels

class InMemoryHotels: Hotels {
    private val hotels = mutableListOf<Hotel>()

    override fun add(hotel: Hotel) {
        hotels.add(hotel)
    }

    override fun findById(hotelId: Int): Hotel? {
        return hotels.find { it.id == hotelId }
    }
}
