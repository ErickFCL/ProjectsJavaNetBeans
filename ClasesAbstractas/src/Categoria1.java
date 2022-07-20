
import java.util.Scanner;


public class Categoria1 extends Empleado{
    static Scanner linea = new Scanner (System.in);
    
    private double sueldoFijo;
    private boolean empleadoDelMes;

    public Categoria1() {
    }

    public Categoria1(boolean empleadoDelMes, double sueldoFijo, double sueldo, int tardanzas, double bonos, double descuentos, String categoria, String nombre) {
        super(sueldo, tardanzas, bonos, descuentos, categoria, nombre);
        this.sueldoFijo = sueldoFijo;
        this.empleadoDelMes = empleadoDelMes;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    public boolean isEmpleadoDelMes() {
        return empleadoDelMes;
    }

    public void setEmpleadoDelMes(boolean empleadoDelMes) {
        this.empleadoDelMes = empleadoDelMes;
    }

    @Override
    public String toString() {
        return "Emplado categoria 1{" + "sueldoFijo=" + sueldoFijo + ", empleadoDelMes=" + empleadoDelMes + ", sueldo=" + sueldo + ", tardanzas=" + tardanzas + ", descuentos=" + descuentos + ", Categoria=" + categoria + ", nombre=" + nombre + ", bonos= " + bonos + '}';
    }

    @Override
    public void calcularSueldo() {
        //super.sueldo = this.getSueldoFijo() - super.getDescuentos() + super.getBonos();
        super.setSueldo(this.getSueldoFijo() - super.getDescuentos() + super.getBonos());
    }

    @Override
    public void calcularBonos() {
        if(this.isEmpleadoDelMes() == true){
            this.setBonos(this.getSueldoFijo()*0.5);
        } 
    }

    @Override
    public void calcularDescuentos() {
        if(super.getTardanzas()>= 5){
            super.setDescuentos(descuentos);
        }
    }
   
}
