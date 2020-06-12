package com.kata.domain.booking

import com.kata.domain.hotel.RoomTypes
import java.time.LocalDate

class BookingService(private val bookings: Bookings) {
    fun book(employeeId: Int, hotelId: Int, roomType: RoomTypes, checkIn: LocalDate, checkOut: LocalDate): Booking {
        val booking = Booking(employeeId, hotelId, roomType, checkIn, checkOut)
        bookings.add(booking)
        return booking
    }
}
