
package clases;
public class Servicio extends Usuario{
    protected double tiempo;
    protected int cantidad;
    protected int precio;
    protected String tipo;

    public Servicio() {
    }

    public Servicio(double tiempo, int cantidad, int precio, String tipo, String nombre, String apellido, String dni, String procedencia, int anio, int mes, int dia) {
        super(nombre, apellido, dni, procedencia, anio, mes, dia);
        this.tiempo = tiempo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
