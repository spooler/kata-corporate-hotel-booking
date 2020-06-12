package com.kata.infrastructure

import com.kata.domain.booking.Booking
import com.kata.domain.booking.Bookings

class InMemoryBookings: Bookings {
    private val bookings = mutableListOf<Booking>()

    override fun add(book: Booking) {
        bookings.add(book)
    }

    override fun findById(id: Int): Booking? {
        return bookings.find { it.id == id }
    }

    override fun nextId() = ++nextId

    companion object {
        private var nextId = 0
    }
}
