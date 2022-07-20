package proyectoherencia;
public class EStudiante extends Persona{
    public double promedio;

    public EStudiante() {
    }

    public EStudiante(String paterno, String materno, String nombre, double promedio) {
        super(paterno, materno, nombre);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public void imprimir() {
        super.imprimir(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Promedio: "+this.getPromedio());
    }
    
}
