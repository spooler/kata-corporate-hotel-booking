import com.kata.domain.HotelService
import com.kata.infrastructure.InMemoryHotels
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AddHotelFeature {
    @Test
    fun `Create a hotel with respectives rooms`() {
        val hotels = InMemoryHotels()
        val hotelService = HotelService(hotels)
        val hotelId = hotels.nextId()

        hotelService.addHotel(hotelId, "Sheraton")

        val hotel = hotelService.findHotelBy(hotelId)
        assertThat(hotel).isNotNull()
    }
}
