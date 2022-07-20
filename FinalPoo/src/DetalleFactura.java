
public class DetalleFactura extends CabezeraFactura{
    protected String descripcion;
    protected int cantidad;
    protected double pUnitario;
    protected double importe;
    protected double subTotal;
    protected double igv;
    protected double total;

    public DetalleFactura() {
    }

    public DetalleFactura(String descripcion, int cantidad, double pUnitario, double importe, double subTotal, double igv, double total, String nomSenior, String direccion, String telefono, String ruc, int fechaFactura) {
        super(nomSenior, direccion, telefono, ruc, fechaFactura);
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
        this.importe = importe;
        this.subTotal = subTotal;
        this.igv = igv;
        this.total = total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
}
