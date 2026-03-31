import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    @Test
    void testCamposVacios() {
        HotelService service = new HotelService();

        String resultado = service.registrarHabitacion("", "", null);

        assertEquals("Debe ingresar los datos requeridos", resultado);
    }

    public String registrarHabitacion(String numero, String nombre, LocalDate fecha) {
        if (numero.isEmpty() || nombre.isEmpty() || fecha == null) {
            System.out.println("Debe ingresar los datos requeridos");
        }
        return "";
    }



}