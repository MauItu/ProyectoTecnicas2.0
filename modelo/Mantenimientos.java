package modelo;

public class Mantenimientos extends Entidad {
    private int cantidad;

    public Mantenimientos(String nombre, int cantidad) {
        super(nombre);
        this.cantidad = cantidad;
    }

    public double afilar(int cantidad) {
        double precioPorInstrumento = 10;
        double precioTotal = cantidad * precioPorInstrumento;
        System.out.println("Realizando mantenimiento de afilado para " + cantidad + " instrumentos. Precio total: $" + precioTotal);
        return precioTotal;
    }

    public double desmanchar(int cantidad) {
        double precioPorInstrumento = 15;
        double precioTotal = cantidad * precioPorInstrumento;
        System.out.println("Realizando mantenimiento de desmanchado para " + cantidad + " instrumentos. Precio total: $" + precioTotal);
        return precioTotal;
    }

    public double alineacion(int cantidad) {
        double precioPorInstrumento = 20;
        double precioTotal = cantidad * precioPorInstrumento;
        System.out.println("Realizando mantenimiento de alineación para " + cantidad + " instrumentos. Precio total: $" + precioTotal);
        return precioTotal;
    }

    public double correccionPuntas(int cantidad) {
        double precioPorInstrumento = 12;
        double precioTotal = cantidad * precioPorInstrumento;
        System.out.println("Realizando corrección de puntas para " + cantidad + " instrumentos. Precio total: $" + precioTotal);
        return precioTotal;
    }

    public double perforacion(int cantidad) {
        double precioPorInstrumento = 25;
        double precioTotal = cantidad * precioPorInstrumento;
        System.out.println("Realizando perforación para " + cantidad + " instrumentos. Precio total: $" + precioTotal);
        return precioTotal;
    }
}
