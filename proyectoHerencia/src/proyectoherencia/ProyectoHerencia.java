
package proyectoherencia;

import java.util.Scanner;

public class ProyectoHerencia {
    static Docente [] docente;
    static EStudiante [] estudiante;
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do{
            opcion= menu();
            switch(opcion){
                case 1:
                    ingresarPersona();
                    break;
                case 2:
                    listarPersonas();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicacion. . . ");
                    
                    break;
                default :
                    System.out.println("OPcion incorrecta");
            }
        }while(opcion != 4);
        
    }
    public static int menu(){
        int op;
        System.out.println("1. Ingresar Persona");
        System.out.println("2. Listar Persona");
        System.out.println("3. total de personas");
        System.out.println("4. Salir");
        System.out.print("\tOpcion: ");
        op = lector.nextInt();
        return op;
    }
    public static void ingresarPersona(){
        System.out.println("1. Estudiante");
        System.out.println("2. Docente");
        System.out.println("3. Regresar");
        System.out.print("\tOp: ");
        int op,n;
        op = lector.nextInt();
        String nom,pat,mat;
        do{
            switch(op){
                case 1:
                    n=0;
                    System.out.print("Cantidad de Estudiantes: ");
                    n=lector.nextInt();
                    EStudiante[] estudiante = new EStudiante[n];
                    lector.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nombre: ");
                        nom = lector.nextLine();
                        System.out.print("Apellido Paterno: ");
                        pat = lector.nextLine();
                        System.out.print("Apellido Materno: ");
                        mat = lector.nextLine();
                        estudiante[i] = new EStudiante(pat, mat, nom,0);
                    }
                    break;
                case 2:
                    n=0;
                    System.out.print("Cantidad de Docentes: ");
                    n=lector.nextInt();
                    Docente[] docente = new Docente[n];
                    lector.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nombre: ");
                        nom = lector.nextLine();
                        System.out.print("Apellido Paterno: ");
                        pat = lector.nextLine();
                        System.out.print("Apellido Materno: ");
                        mat = lector.nextLine();
                        docente[i] = new Docente(pat, mat, nom,0);
                       
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }while(op != 3);
    }
    public static void listarPersonas(){
        System.out.println("Estudiantes");
        for (int i = 0; i < estudiante.length; i++) {
            estudiante[i].toString();
            
        }
        System.out.println("Docentes");
        for (int i = 0; i < docente.length; i++) {
            docente[i].toString();
        }
    }
}
