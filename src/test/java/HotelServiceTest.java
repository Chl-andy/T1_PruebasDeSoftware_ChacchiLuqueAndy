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
        if (camposVacios(numero, nombre, fecha)) {
            return "Debe ingresar los datos requeridos";
        }

        return "";
    }

    private boolean camposVacios(String numero, String nombre, LocalDate fecha) {
        return numero == null || numero.isEmpty() || nombre == null || nombre.isEmpty() || fecha == null;
    }

}