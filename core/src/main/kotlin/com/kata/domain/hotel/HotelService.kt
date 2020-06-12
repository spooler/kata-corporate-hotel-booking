package com.kata.domain.hotel

class HotelService(private val hotels: Hotels) {
    fun addHotel(hotelId: Int, hotelName: String) {
        hotels.add(Hotel(hotelId, hotelName))
    }
}
