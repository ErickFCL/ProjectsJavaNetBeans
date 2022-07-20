
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Usuarios {
     static Sauna[] p; 
    static Scanner linea = new Scanner (System.in);
    static Set<Sauna> usuarioSauna = new HashSet<Sauna>();
    public static void main(String[] args) {
        
        listarPersona();
        mostrar();
        buscar();
   
   
    }
     public static void  listarPersona(){
         int n, codigo;
        String nombre;
       
        System.out.println("...::INGRESE NMERO DE USUARIOS QUE DESEE REGISTRAR::...");
         System.out.println("cantidad: ");
        n = linea.nextInt();
        p = new Sauna[n];
        for (int i = 0; i < p.length; i++) {
            System.out.println("Ingrese Nombre: ");
            nombre = linea.next();
            System.out.println("Ingrese Codigo: ");
            codigo = linea.nextInt();
            p[i] = new Sauna(nombre, codigo);
            
        }

   
    
        for (int i = 0; i < p.length; i++) {
            usuarioSauna.add(p[i]);
        }
    
    }
     public static void mostrar(){
          System.out.println("\t\t...::LISTA DE PERSONAS::..."); 
        for (Sauna sa : usuarioSauna) {
            System.out.println("Nombre: "+sa.getNombre()+" Codigo: "+(sa.getCodigo()));
        }
     }
      public static void buscar(){
          System.out.println(".::: BUSQUEDA");
          int rpta, codigo;String nombre;
          System.out.println("por nombre[0] o codigo[1]");
          rpta = linea.nextInt();
          if(rpta == 0){
              System.out.println("nombre a buscar: ");
              nombre = linea.next();
              for (Sauna p1 : p) {
                  if(nombre.equals(p1.getNombre())){
                      System.out.println("encontrado");
                      System.out.println(p1.toString());
                  }else{
                      
                  }
              }
          }
         if(rpta == 1){
              System.out.println("Codigo a buscar: ");
              codigo = linea.nextInt();
              for (int i = 0; i < p.length; i++) {
                 if(codigo == p[i].getCodigo()){
                     System.out.println("encontrado");
                     System.out.println(p[i].toString());
                 }
                  
              }
        }
     }
}