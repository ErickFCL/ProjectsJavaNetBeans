
public class Venta {
    protected String cliente;
    protected String vendedor;
    protected int puntodeVenta;
    protected double montoTotal;

    public Venta() {
    }

    public Venta(String cliente, String vendedor, int puntodeVenta, double montoTotal) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.puntodeVenta = puntodeVenta;
        this.montoTotal = montoTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getPuntodeVenta() {
        return puntodeVenta;
    }

    public void setPuntodeVenta(int puntodeVenta) {
        this.puntodeVenta = puntodeVenta;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
}
