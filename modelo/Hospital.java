package modelo;

public class Hospital extends Entidad {
    private String direccion;

    public Hospital(String nombre, String direccion) {
        super(nombre);
        this.direccion = direccion;
    }

    public Cita agendarCita(String dia) {
        String hora = "11am";
        return new Cita(dia, hora);
    }
}
