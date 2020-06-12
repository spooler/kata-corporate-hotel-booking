package com.kata.domain.booking

interface Bookings {
    fun add(book: Booking)
    fun findById(id: Int): Booking?
    fun nextId(): Int
}
