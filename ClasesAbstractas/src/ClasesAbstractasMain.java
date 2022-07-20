
import java.util.Scanner;


public class ClasesAbstractasMain {

    static Scanner linea = new Scanner (System.in);
    static Empleado [] e;
    
    public static void main(String[] args) {
        System.out.print("\nIngresar cantidad de emmpleados: ");
        int a = linea.nextInt();
        e = new Empleado [a];
        int d=0;
        for (int i = 0; i < a; i++) {
            
            System.out.print("\nIngresar categoria: ");
            System.out.print("\n1. Categoria 1");
            System.out.print("\n2. Categoria 2");
            System.out.print("\n3. Categoria 3");
            System.out.print("\nOpcion: \t");
            int n = linea.nextInt();

            switch(n){
                case 1:
                    ingresarEmpleadoCategoria1(d);
                    d++;
                    break;
                case 2:
                    ingresarEmpleadoCategoria2(d);
                    d++;
                    break;
                case 3:
                    ingresarEmpleadoCategoria3(d);
                    d++;
            }   
        }
        imprimirEmpleados();
        
    }
    
    static void ingresarEmpleadoCategoria1(int d){
        boolean empleadoDelMes; int tardanzas, n; double sueldoFijo, sueldo, bonos, descuentos; String categoria, nombre;
        
        System.out.println("Categoria 1 - Empleado "+(d+1)+": ");
        System.out.print("\nIngrese nombre: ");
        nombre = linea.next();
        categoria = "Categoria 1";
        System.out.print("\nIngresar sueldo fijo: ");
        sueldoFijo = linea.nextDouble();
        System.out.print("\nNumero de tardanzas: ");
        tardanzas = linea.nextInt();
        System.out.print("\nDescuento: ");
        descuentos = linea.nextDouble();
        System.out.print("\n¿Empleado del mes?");
        System.out.print("\n1. Si");
        System.out.print("\n2. No");
        System.out.print("\nOpcion:\t");
        n = linea.nextInt();
        sueldo = 0;
        bonos = 0;

        switch(n){
            case 1:
                empleadoDelMes = true;
                e[d] = new Categoria1(empleadoDelMes, sueldoFijo,sueldo, tardanzas,bonos, descuentos, categoria,nombre);
                break;
            case 2:
                empleadoDelMes = false;
                e[d] = new Categoria1(empleadoDelMes, sueldoFijo,sueldo, tardanzas,bonos, descuentos, categoria,nombre);
                break;
            default:
                System.out.println("Dato incorrecto");
        }

        ((Categoria1)e[d]).calcularBonos();
        ((Categoria1)e[d]).calcularDescuentos();
        ((Categoria1)e[d]).calcularSueldo();
   
    }
    
    static void ingresarEmpleadoCategoria2(int d){
        int tardanzas, nroDevoluciones; double sueldoBasico,ventasMes, bonos = 0, sueldo = 0, descuentos = 0; String categoria, nombre;
        
        System.out.println("Categoria 2 - Empleado "+(d+1)+": ");
        System.out.print("\nIngrese nombre: ");
        nombre = linea.next();
        categoria = "Categoria 2";
        System.out.print("\nIngrese sueldo basico: ");
        sueldoBasico = linea.nextDouble();
        System.out.print("\nIngrese el numero de devoluciones: ");
        nroDevoluciones = linea.nextInt();
        System.out.print("\nVenta mensual: ");
        ventasMes = linea.nextDouble();
        System.out.print("\nNumero de tardanzas a la semana: ");
        tardanzas = linea.nextInt();
        
        e[d] = new Categoria2(nroDevoluciones, sueldoBasico, ventasMes, sueldo, tardanzas, bonos, descuentos, categoria, nombre);
        ((Categoria2)e[d]).calcularBonos();
        ((Categoria2)e[d]).calcularDescuentos();
        ((Categoria2)e[d]).calcularSueldo();
    }
    
    static void ingresarEmpleadoCategoria3(int d){
        int horas, topHoras, tardanzas; double sueldoPorHoras, sueldo=0, bonos=0, descuentos=0; String categoria, nombre;
        
        System.out.println("Categoria 3 - Empleado "+(d+1)+": ");
        System.out.print("\nIngrese nombre: ");
        nombre = linea.next();
        categoria = "Categoria 3";
        System.out.print("\nIngresar numero de horas: ");
        horas = linea.nextInt();
        if(horas >40) System.out.print("\nEsta explotando al trabajador");
        System.out.print("\nIngresar numero de tardanzas: ");
        tardanzas = linea.nextInt();
        topHoras = 40;
        sueldoPorHoras = 25;
        
        e[d] = new Categoria3(horas, topHoras, sueldoPorHoras, sueldo, tardanzas, bonos, descuentos, categoria, nombre);
        ((Categoria3)e[d]).calcularBonos();
        ((Categoria3)e[d]).calcularDescuentos();
        ((Categoria3)e[d]).calcularSueldo();
    }
    
    static void imprimirEmpleados(){
        for (Empleado e1 : e) {
            System.out.println(e1.toString());
        }
    }
}