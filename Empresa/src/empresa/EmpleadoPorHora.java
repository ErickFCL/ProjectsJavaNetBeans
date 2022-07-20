
package empresa;

public class EmpleadoPorHora extends Empleado{
   protected double horasTrabajadas;

    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(double horasTrabajadas, double sueldo, double descuento, int tardanzas) {
        super(sueldo, descuento, tardanzas);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

   
    @Override
    public void calcularDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularBonificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularSueldoNeto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
