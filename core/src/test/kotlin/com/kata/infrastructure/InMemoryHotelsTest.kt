package com.kata.infrastructure

import com.kata.domain.hotel.Hotel
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InMemoryHotelsTest {
    @Test fun `add a hotel`() {
        val hotels = InMemoryHotels()
        val hotelId = 2
        val hotel = Hotel(hotelId, "Sheraton")

        hotels.add(hotel)

        assertThat(hotels.findById(hotelId)?.id).isEqualTo(hotelId)
    }
}