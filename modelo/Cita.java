package modelo;

public class Cita {
    private String dia;
    private String hora;

    public Cita(String dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
