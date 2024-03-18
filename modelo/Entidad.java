package modelo;

public class Entidad {
    private String nombre;

    public Entidad() {
        this.nombre = "";
    }


    public Entidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
