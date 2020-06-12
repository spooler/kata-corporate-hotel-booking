package com.kata.domain.booking

import com.kata.domain.hotel.RoomTypes
import java.time.LocalDate

class Booking(val id: Int, val employeeId: Int, hotelId: Int, roomType: RoomTypes, checkIn: LocalDate, checkOut: LocalDate) {

}
