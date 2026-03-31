import java.time.LocalDate;

public class HotelService {

    public String registrarHabitacion(String numero, String nombre, LocalDate fecha) {

        if (numero.isEmpty() || nombre.isEmpty() || fecha == null) {
            return "Debe ingresar los datos requeridos";
        }

        if (!numero.matches("[1-3][0-9]{2}")) {
            return "Ingrese una habitación valida";
        }

        if (!nombre.matches("[a-zA-Z]{4,}")) {
            return "Recuerde que el nombre del cliente debe contener al menos cuatro caracteres";
        }

        if (!fecha.isAfter(LocalDate.now())) {
            return "Debe ingresar una fecha valida";
        }

        return "El registro ha sido exitoso";
    }

}