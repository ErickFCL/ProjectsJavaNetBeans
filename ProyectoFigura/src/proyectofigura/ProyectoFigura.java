package proyectofigura;

import java.util.Scanner;

public class ProyectoFigura {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
      /* Circulo ci = new Circulo(10.5,"circulo");
       Cuadrado c = new Cuadrado(3.43,"cuadrado");
       c.calcularArea();
       ci.calcularArea();
       c.imprimir();
       ci.imprimir();*/
       
       Figura [] f =new Figura[2];
        System.out.println("1. Cuadrado");
        System.out.println("2. Circulo");
        System.out.println("3. Salir");
        System.out.print("\tOPcion: ");
    
        int op = lector.nextInt();
        double lado, radio;String nombre;
        int i=0;
        switch(op){
            case 1:
                f[i] = new Cuadrado(10.3,"Cuadrado");
                f[i].calcularArea();
                f[i].imprimir();
                System.out.println(f[i].getClass().getName());
                i++;
                break;
            case 2:
                f[i] = new Circulo(1.3,"Circulo");
                f[i].calcularArea();
                f[i].imprimir();
                System.out.println(f[i].getClass().getName());
                i++;
                break;
            case 3:
                System.out.println("Saliendo de la Aplicacion. . . ");
                break;
            default:
                System.out.println("opcion Invalida");
        }
        
    }
    
}
