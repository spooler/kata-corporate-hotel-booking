package com.kata.domain

import com.kata.domain.booking.BookingService
import com.kata.domain.booking.Bookings
import com.kata.domain.hotel.Hotel
import com.kata.domain.hotel.HotelService
import com.kata.domain.hotel.Hotels
import com.kata.domain.hotel.RoomTypes
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import java.time.LocalDate

internal class BookingServiceTest{
    @Test fun `add new book with the given information`() {
        val book = bookingService.book(
            employeeId = 5,
            hotelId = 56,
            roomType = RoomTypes.SINGLE,
            checkIn = LocalDate.now(),
            checkOut = LocalDate.now().plusDays(1)
        )

        verify { bookings.add(book) }
    }

    private val bookings = mockk<Bookings>(relaxed = true)
    private val bookingService = BookingService(bookings)
}
