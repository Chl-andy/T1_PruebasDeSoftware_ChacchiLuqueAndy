import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    @Test
    void testNumeroHabitacionConLetras() {
        HotelService service = new HotelService();

        String resultado = service.registrarHabitacion("1A3", "Carlos", LocalDate.now().plusDays(1));

        System.out.println("Resultado: " + resultado);
        assertEquals("Ingrese una habitación valida", resultado);

    }
}