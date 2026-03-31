import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    @Test
    void testNombreClienteInvalido() {
        HotelService service = new HotelService();
        String resultado = service.registrarHabitacion("101", "Ana", LocalDate.now().plusDays(1));

        assertEquals("Recuerde que el nombre del cliente debe contener al menos cuatro caracteres", resultado);
    }
}