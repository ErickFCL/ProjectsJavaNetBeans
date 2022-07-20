
public class Categoria3 extends Empleado{
    
    private int horas;
    private int topHoras;
    private double sueldoPorHoras;

    public Categoria3() {
    }

    public Categoria3(int horas, int topHoras, double sueldoPorHoras, double sueldo, int tardanzas, double bonos, double descuentos, String categoria, String nombre) {
        super(sueldo, tardanzas, bonos, descuentos, categoria, nombre);
        this.horas = horas;
        this.topHoras = topHoras;
        this.sueldoPorHoras = sueldoPorHoras;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getTopHoras() {
        return topHoras;
    }

    public void setTopHoras(int topHoras) {
        this.topHoras = topHoras;
    }

    public double getSueldoPorHoras() {
        return sueldoPorHoras;
    }

    public void setSueldoPorHoras(double sueldoPorHoras) {
        this.sueldoPorHoras = sueldoPorHoras;
    }

    @Override
    public String toString() {
        return "Categoria3{" + "horas=" + horas + ", topHoras=" + topHoras + ", sueldoPorHoras=" + sueldoPorHoras  + ", sueldo=" + sueldo + ", tardanzas=" + tardanzas + ", descuentos=" + descuentos + ", Categoria=" + categoria +'}';
    }

    @Override
    public void calcularSueldo() {
        super.setSueldo(this.getHoras()*this.getSueldoPorHoras()-super.getDescuentos());
    }

    @Override
    public void calcularBonos() {
        super.setBonos(0);
    }

    @Override
    public void calcularDescuentos() {
        if(super.getTardanzas()>=1 && super.getTardanzas()<4){
            super.setDescuentos(10);
        } else if(super.getTardanzas()>=4 && super.getTardanzas()<7){
            super.setDescuentos(20);
        }
    }
}
