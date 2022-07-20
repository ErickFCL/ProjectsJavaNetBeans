
public class Categoria2 extends Empleado{
    private double ventasMes;
    private double sueldoBasico;
    private int nroDevoluciones;

    public Categoria2() {
    }

    public Categoria2(int nroDevoluciones, double sueldoBasico, double ventasMes, double sueldo, int tardanzas, double bonos, double descuentos, String categoria, String nombre) {
        super(sueldo, tardanzas, bonos, descuentos, categoria, nombre);
        this.ventasMes = ventasMes;
        this.sueldoBasico = sueldoBasico;
        this.nroDevoluciones = nroDevoluciones;
    }

    public double getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(double ventasMes) {
        this.ventasMes = ventasMes;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getNroDevoluciones() {
        return nroDevoluciones;
    }

    public void setNroDevoluciones(int nroDevoluciones) {
        this.nroDevoluciones = nroDevoluciones;
    }

    @Override
    public String toString() {
        return "Empleado Categoria2{" + "ventasMes=" + ventasMes + ", sueldo=" + sueldo + ", tardanzas=" + tardanzas + ", descuentos=" + descuentos + ", Categoria=" + categoria + ", nombre=" + nombre + ", bonos= " + bonos +  + '}';
    }

    @Override
    public void calcularSueldo() {
        super.setSueldo(this.getSueldoBasico() + super.getBonos() - super.getDescuentos());
    }

    @Override
    public void calcularBonos() {
        if(this.ventasMes >= 20000 && this.ventasMes <= 50000){
            super.setBonos(this.getSueldoBasico()*0.05);
        } else if(this.ventasMes > 50000 && this.ventasMes <= 100000){
            super.setBonos(this.getSueldoBasico()*0.1);
        } else if(this.ventasMes > 100000){
            super.setBonos(this.getSueldoBasico()*0.25);
        }
    }

    @Override
    public void calcularDescuentos() {
        if(super.getTardanzas()>=1 && super.getTardanzas()<4){
            super.setDescuentos(50);
        } else if(super.getTardanzas() >= 4 && super.getTardanzas() < 7){
            super.setDescuentos(100);
        } else if(super.getTardanzas() >=7  && super.getTardanzas() < 10)
            super.setDescuentos(150);
    }
    
}
