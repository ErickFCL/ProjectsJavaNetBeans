
package empresa;

public abstract class Empleado { 
    protected double sueldo;
    protected double descuento;
    protected int tardanzas;
    public abstract void calcularDescuento();
    public abstract void calcularBonificacion();
    public abstract void calcularSueldoNeto();

    public Empleado() {
    }

    public Empleado(double sueldo, double descuento, int tardanzas) {
        this.sueldo = sueldo;
        this.descuento = descuento;
        this.tardanzas = tardanzas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(int tardanzas) {
        this.tardanzas = tardanzas;
    }
    
}
