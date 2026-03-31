import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    @Test
    void testFechaInvalida() {
        HotelService service = new HotelService();
        String resultado = service.registrarHabitacion("101", "Carlos", LocalDate.now());
        assertEquals("Debe ingresar una fecha valida", resultado);
    }
}