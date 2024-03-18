package modelo;

import java.util.Date;

public class PostMantenimiento extends Entidad {
    private Date fecha;
    private String accionRealizada;
    private int codigoEmpleado;
    private double garantia;

    // Constructor
    public PostMantenimiento(Date fecha, String accionRealizada, int codigoEmpleado, double garantia) {
        super("");
        this.fecha = fecha;
        this.accionRealizada = accionRealizada;
        this.codigoEmpleado = codigoEmpleado;
        this.garantia = garantia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAccionRealizada() {
        return accionRealizada;
    }

    public void setAccionRealizada(String accionRealizada) {
        this.accionRealizada = accionRealizada;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public double getGarantia() {
        return garantia;
    }

    public void setGarantia(double garantia) {
        this.garantia = garantia;
    }
}
