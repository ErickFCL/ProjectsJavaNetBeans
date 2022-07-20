
public abstract class Empleado {
    
    protected double sueldo;
    protected int tardanzas;
    protected double bonos;
    protected double descuentos;
    protected String categoria;
    protected String nombre;

    public Empleado() {
    }

    public Empleado(double sueldo, int tardanzas, double bonos, double descuentos, String categoria, String nombre) {
        this.sueldo = sueldo;
        this.tardanzas = tardanzas;
        this.bonos = bonos;
        this.descuentos = descuentos;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public double getBonos() {
        return bonos;
    }

    public void setBonos(double bonos) {
        this.bonos = bonos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getTardanzas() {
        return tardanzas;
    }

    public void setTardanzas(int tardanzas) {
        this.tardanzas = tardanzas;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + ", tardanzas=" + tardanzas + ", descuentos=" + descuentos + ", Categoria=" + categoria + ", nombre=" + nombre + ", bonos= " + bonos +'}';
    }

    public abstract void calcularSueldo();
    public abstract void calcularBonos();
    public abstract void calcularDescuentos();
}
