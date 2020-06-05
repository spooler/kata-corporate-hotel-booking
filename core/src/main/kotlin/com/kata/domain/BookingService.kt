package com.kata.domain

import java.time.LocalDate

interface BookingService {
    fun addHotel(hotelId: ?, hotelName: ?)
    fun setRoom(hotelId: ?, number: ?, roomType: ?)
    fun findHotelBy(hotelId: ?): ?
    fun book(employeeId: ?, hotelId: ?, roomType: ?, checkIn: LocalDate, checkOut: LocalDate): Booking
}
