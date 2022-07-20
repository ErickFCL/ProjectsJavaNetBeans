package proyectofigura;
public class Circulo extends Figura{
    public double radio;
    public Circulo(){}

    public Circulo(double radio, String tipo){
        super(tipo);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double var = Math.PI*Math.pow(this.getRadio(),2);
        super.setArea(var);
        return var;
        
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Radio: "+this.getRadio());
        System.out.println("Area: "+super.getArea());
    }
    
}
