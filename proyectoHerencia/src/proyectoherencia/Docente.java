
package proyectoherencia;

public class Docente extends Persona{
    public double sueldo;

    public Docente() {
    }

    public Docente(String paterno, String materno, String nombre, double sueldo) {
        super(paterno, materno, nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void imprimir() {
        super.imprimir(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sueldo: "+this.getSueldo());
    }
    
}
