
package empresa;

public class EmpleadoSueldoFijo extends Empleado{
   protected double bonificacion;


    public EmpleadoSueldoFijo() {
    }

    public EmpleadoSueldoFijo(double bonificacion, double sueldo, double descuento, int tardanzas) {
        super(sueldo, descuento, tardanzas);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public void calcularDescuento() {
       
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
