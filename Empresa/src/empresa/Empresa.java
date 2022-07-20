package empresa;

import java.util.Scanner;

public class Empresa {
    static Scanner linea = new Scanner(System.in);
    static int tardanzas,n;
    static double sueldoF;
    static String rpta;
    static double bonificacion = 0;
    static double descuento = 0;
    static EmpleadoSueldoFijo[] esF = new EmpleadoSueldoFijo [10];
    static EmpleadoSueldoBasico[] esb = new EmpleadoSueldoBasico [10];
    static EmpleadoPorHora[] epH = new EmpleadoPorHora [10];
    public static void main(String[] args) {
       
        System.out.println("..::: EMPRESA :::...");
        System.out.println("-----------------------");
        int opcion;
        do{
            opcion = menu();
            switch(opcion){
            case 1:
                System.out.println(" Categoria (sueldo fijo)");
                sueldo_fijo();
                break;
            case 2:
                   System.out.println("Categoria (sueldo basico)");
                   sueldo_basico();
                break;
            case 3:
                   System.out.println("Categoria (sueldo por hora)");
                   sueldo_por_hora();
                break;
            case 4:
                System.out.println("..:: MOSTRANDO ::..");
                mostrar();
                break;
            case 5:
                System.out.println("SALIENDO. . . \n");
                break;
            default:
    
        }
        }while(opcion !=5);
    }
    public static int menu(){
        int op;
        System.out.println(" **** MENU ***");
        System.out.println("[1] Categoria (sueldo fijo)");
        System.out.println("[2] Categoria (sueldo basico)");
        System.out.println("[3] Categoria (sueldo por hora)");
        System.out.println("[4] MOSTRAR");
        System.out.println("[5] Salir");
        System.out.print("\tOpcion: ");
        op = linea.nextInt();
        return op;
    }   
    public static void sueldo_fijo(){
        System.out.print("Cuantos Empleados: ");
        n = linea.nextInt();
      
        for (int i = 0; i < n; i++) {
            bonificacion = 0;
            descuento = 0;
            System.out.print("sueldo: ");
            sueldoF = linea.nextDouble();
            System.out.print("cuantas Tardanzas (mes): ");
            tardanzas = linea.nextInt();
            if(tardanzas >=5){
                System.out.print("Cantidad a descontar: ");
                descuento = linea.nextDouble();
                sueldoF -= descuento;
            }else{
                System.out.println("No se le descuenta nada");
            }
            System.out.print("fue seleccionado como el empleado del mes [si][no]: ");
            rpta = linea.next();
            if("si".equals(rpta)){
                System.out.println("bonificacion dada de 50%");
               bonificacion = sueldoF * 0.5;
               sueldoF +=bonificacion;
            }else{
                System.out.println("No tiene bonificacion");
            }
            esF[i] = new EmpleadoSueldoFijo(bonificacion, sueldoF, descuento, tardanzas);
        }
    }
     public static void sueldo_basico(){
        System.out.print("Cuantos Empleados: ");
        n = linea.nextInt();
        int cantidad;
        for (int i = 0; i < n; i++) {
            bonificacion = 0;
            descuento = 0;
            System.out.print("sueldo: ");
            sueldoF = linea.nextDouble();
            System.out.print("Cantidad de ventas: ");
            cantidad = linea.nextInt();
            if(cantidad >=  20000 ){
               bonificacion = sueldoF * 0.05;
               sueldoF +=bonificacion;
            }else if (cantidad >=  50000){
               bonificacion = sueldoF * 0.1;
               sueldoF +=bonificacion;
            }else if (cantidad >=  100000){
                bonificacion = sueldoF * 0.25;
                sueldoF +=bonificacion;
            }
            System.out.print("existen devoluciones [si][no]: ");
            rpta = linea.next();
            if("si".equals(rpta)){
                System.out.print("cuantas devoluciones: ");
                int devoluciones = linea.nextInt();
                devoluciones *=10;
                sueldoF -=devoluciones;
            }
            System.out.println("cuantas Tardanzas (mes): ");
            tardanzas = linea.nextInt();
            if(tardanzas >= 3){
                System.out.println("se le descuenta S/.50");
                sueldoF -=50;
            }else{
                System.out.println("no se le descuenta nada");
            }
            esb[i] = new EmpleadoSueldoBasico(bonificacion, sueldoF, descuento, tardanzas);
        }
    }
     public static void sueldo_por_hora(){
        System.out.print("Cuantos Empleados: ");
        n = linea.nextInt();
        for (int i = 0; i < n; i++) {
            bonificacion = 0;
            descuento = 0;
             System.out.println("cuantas horas trabajo a la semana");
            int horasTrabajadas = linea.nextInt();
            if(horasTrabajadas <= 40){
                 horasTrabajadas *=25 ;
            System.out.println("cuantas Tardanzas (semanales)");
            tardanzas = linea.nextInt();
                if(tardanzas>=3){
                    System.out.println("se le descuenta S/.10");
                    sueldoF -=10;
                }else{
                    System.out.println("no se le descuenta nada");
                }

            }else{
                System.out.println("Solo puede trabajar 40 horas semanales, no se explote");
            }
        }
    }
     public static void mostrar(){
         
         for (int i = 0; i < esF.length; i++) {
             System.out.println("bonificacion: "+esF[i].getBonificacion()
             +"\tTardanzas: "+esF[i].getTardanzas()+"\tDescuento: "
             +esF[i].getDescuento()
             +"\tSueldo: "+esF[i].getSueldo());
             
         }
         System.out.println("   llega");
         for (int i = 0; i < esb.length; i++) {
            System.out.println("bonificacion: "+esb[i].getBonificacion()
             +"\tTardanzas: "+esb[i].getTardanzas()+"\tDescuento: "
             +esb[i].getDescuento()
             +"\tSueldo: "+esb[i].getSueldo());
             
         }
         for (int i = 0; i < epH.length; i++) {
            System.out.println("Horas Trabajadas: "+epH[i].getHorasTrabajadas()
             +"\tTardanzas: "+epH[i].getTardanzas()+"\tDescuento: "
             +epH[i].getDescuento()
             +"\tSueldo: "+epH[i].getSueldo());
             
         }
     }
}
