
public class CabezeraFactura {
    protected String nomSenior;
    protected String direccion;
    protected String telefono;
    protected String ruc;
    protected int fechaFactura;

    public CabezeraFactura() {
    }

    public CabezeraFactura(String nomSenior, String direccion, String telefono, String ruc, int fechaFactura) {
        this.nomSenior = nomSenior;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ruc = ruc;
        this.fechaFactura = fechaFactura;
    }

    public String getNomSenior() {
        return nomSenior;
    }

    public void setNomSenior(String nomSenior) {
        this.nomSenior = nomSenior;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public int getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(int fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
    
   
    
}
