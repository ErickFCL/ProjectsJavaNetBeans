package proyectofigura;
public class Cuadrado extends Figura{
    public double lado;
    public Cuadrado(){}
    public Cuadrado(double lado, String tipo){
        super(tipo);
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
   @Override
   public double calcularArea(){
       double var = Math.pow(this.getLado(),2);
       super.setArea(var);
       return var; // o return super.getArea();
   }
   @Override
   public void imprimir(){
       super.imprimir();
       System.out.println("Lado: "+this.getLado());
       System.out.println("Area: "+super.getArea());
   }
}
