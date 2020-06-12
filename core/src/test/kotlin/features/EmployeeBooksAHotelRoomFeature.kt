package features

import com.kata.domain.booking.BookingService
import com.kata.domain.company.CompanyService
import com.kata.domain.hotel.HotelService
import com.kata.domain.hotel.RoomTypes.SINGLE
import com.kata.infrastructure.InMemoryBookings
import com.kata.infrastructure.InMemoryEmployees
import com.kata.infrastructure.InMemoryHotels
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class EmployeeBooksAHotelRoomFeature {
    @Test fun `A company employee should be capable of book a room in the given hotel`() {
        companyService.addEmployee(150, 1000)
        hotelService.addHotel(100, "Sheraton")

        val booking = bookingService.book(
            employeeId = 1000,
            hotelId = 100,
            roomType = SINGLE,
            checkIn = LocalDate.now(),
            checkOut = LocalDate.now().plusDays(1)
        )

        assertThat(booking.employeeId).isEqualTo(1000)
    }

    private val employees = InMemoryEmployees()
    private val hotels = InMemoryHotels()
    private val bookings = InMemoryBookings()
    private val companyService = CompanyService(employees)
    private val hotelService = HotelService(hotels)
    private val bookingService = BookingService(bookings)
}
