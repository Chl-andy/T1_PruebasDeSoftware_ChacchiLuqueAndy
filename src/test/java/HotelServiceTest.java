import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    @Test
    void testRegistroExitoso() {
        HotelService service = new HotelService();

        String resultado = service.registrarHabitacion("101", "Carlos", LocalDate.now().plusDays(2));

        System.out.println("Resultado: " + resultado);
        assertEquals("El registro ha sido exitoso", resultado);
    }
}