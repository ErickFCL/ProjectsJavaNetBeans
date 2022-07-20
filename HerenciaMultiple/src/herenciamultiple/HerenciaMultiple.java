package herenciamultiple;

import java.util.Random;

public class HerenciaMultiple {
    public static void main(String[] args) {
      Animal [] a = new Animal[3];
      a[0]= new Gato("Michino","Gato");
      a[1]= new Ostra(8.36,"Ostra");
      a[2] = new Hormiga("venenosa", "Hormiga");
      Maquina [] m = new Maquina[3]; 
      m[0] = new Auto("Hervi" , "Maquina");
      m[1] = new Televisor ("21pulgadas", "Maquina");
      m[2] = new Tostadora("LG","Maquina");
      
      Random x = new Random();
      int n=x.nextInt(5);
      switch(n){
          case 0:
              System.out.println(a[0].getClass().getName());
              ((Gato)a[0]).emitir();
              ((Gato)a[0]).mover();
              break;
          case 1:
              System.out.println(a[1].getClass().getName());
              System.out.println(a[1].toString());
              break;
          case 2:
              System.out.println(a[2].getClass().getName());
              ((Hormiga)a[2]).mover();
              break;
          case 3:
              System.out.println(m[0].getClass().getName());
              ((Auto)m[0]).mover();
              ((Auto)m[0]).emitir();
              break;
          case 4:
              System.out.println(m[1].getClass().getName());
               ((Televisor)m[1]).emitir();
              break;
          case 5:
              System.out.println(m[2].getClass().getName());
               Tostadora.encender();
              break;
      }
    }
    
}
