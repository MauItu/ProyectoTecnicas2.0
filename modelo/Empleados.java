package modelo;

public class Empleados extends Entidad {
    private String fechaNacimiento;
    private String cedula;
    private int codigo;

    public Empleados(String nombre, String fechaNacimiento, String cedula, int codigo) {
        super(nombre);
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.codigo = codigo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
