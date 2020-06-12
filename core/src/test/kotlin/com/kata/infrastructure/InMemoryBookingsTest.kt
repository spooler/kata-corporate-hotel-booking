package com.kata.infrastructure

import com.kata.domain.booking.Booking
import com.kata.domain.hotel.RoomTypes
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class InMemoryBookingsTest {
    @Test fun `add a booking`() {
        val booking = aBookingWith(bookings.nextId())

        bookings.add(booking)

        assertThat(bookings.findById(bookingId)?.id).isEqualTo(bookingId)
    }

    @Test fun `next id`() {
        val lastId = bookings.nextId()

        assertThat(bookings.nextId()).isGreaterThan(lastId)
    }

    private fun aBookingWith(id: Int): Booking {
        return Booking(
            id = id,
            employeeId = 100,
            hotelId = 10,
            roomType = RoomTypes.SINGLE,
            checkIn = LocalDate.now(),
            checkOut = LocalDate.now().plusDays(1)
        )
    }

    private val bookings = InMemoryBookings()
    private val bookingId = 1
}
