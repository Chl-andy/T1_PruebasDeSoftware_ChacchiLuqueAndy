import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    @Test
    void testCamposVacios() {
        HotelService service = new HotelService();

        String resultado = service.registrarHabitacion("", "", null);
        System.out.println(resultado);

        assertEquals("Debe ingresar los datos requeridos", resultado);
    }

}