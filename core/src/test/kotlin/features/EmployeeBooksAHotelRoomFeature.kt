package features

import com.kata.domain.BookingService
import com.kata.domain.RoomTypes
import com.kata.domain.RoomTypes.SINGLE
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class EmployeeBooksAHotelRoomFeature {
    @Test fun `A company employee should be capable of book a room in the given hotel`() {
        val bookingService = BookingService()

        val booking = bookingService.book(
            employeeId = 1000,
            hotelId = 100,
            roomType = SINGLE,
            checkIn = LocalDate.now(),
            checkOut = LocalDate.now().plusDays(1)
        )

        assertThat(booking.employeeId).isEqualTo(1000)
    }
}

