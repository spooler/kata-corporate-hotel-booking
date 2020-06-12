package com.kata.domain

import com.kata.domain.hotel.Hotel
import com.kata.domain.hotel.HotelService
import com.kata.domain.hotel.Hotels
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class HotelServiceTest{
    @Test fun `add new employee with the given information`() {
        val hotel = Hotel(aHotelId, "Sheraton")

        hotelService.addHotel(aHotelId, "Sheraton")

        verify { hotels.add(hotel) }
    }

    private val hotels = mockk<Hotels>(relaxed = true)
    private val hotelService = HotelService(hotels)
    private val aHotelId = 15
}
