
public class DetalleVenta {
    protected Producto [] producto;
    protected double cantidad;
    protected double precio;

    public DetalleVenta() {
    }

    public DetalleVenta(Producto[] producto, double cantidad, double precio) {
        this.producto = new Producto[20];
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
