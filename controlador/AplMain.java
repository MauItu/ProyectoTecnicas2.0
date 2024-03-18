package controlador;

import modelo.Cita;
import modelo.Hospital;
import modelo.Mantenimientos;

public class AplMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Nombre Hospital", "Dirección");
        Mantenimientos mantenimientos = new Mantenimientos("Tipo Mantenimiento", 5); // Ejemplo de precio por instrumento

        // Realizar mantenimientos
        mantenimientos.afilar(5);
        mantenimientos.desmanchar(5);
        mantenimientos.alineacion(5);
        mantenimientos.correccionPuntas(5);
        mantenimientos.perforacion(5);

        // Agendar cita
        String dia = "Lunes"; // Ejemplo de día para la cita
        Cita cita = hospital.agendarCita(dia);
        System.out.println("Cita agendada para el día: " + cita.getDia() + " a las " + cita.getHora());
    }
}
