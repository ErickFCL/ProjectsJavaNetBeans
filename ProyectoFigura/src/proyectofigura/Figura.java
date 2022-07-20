
package proyectofigura;

public class Figura {
    protected String tipo;
    protected double area;

    public Figura() {
    }
    
    
    public Figura(String tipo) {
        this.tipo = tipo;
        this.area = 0; 
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public void imprimir(){
        System.out.println("Tipo Figura: "+this.getTipo());
    }
    public double calcularArea(){
        
        return 0;
    }
}
