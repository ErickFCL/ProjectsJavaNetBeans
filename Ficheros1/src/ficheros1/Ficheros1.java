
package ficheros1;

import java.io.File;
import java.io.IOException;




public class Ficheros1 {

    //verificar si existe un archivo
    public static void main(String[] args) {
        
        File file = new File("Archivo creado 1.txt");
        // 2da forma File file = new File("C:\\Users\\PCTUNNING\\Documents\\NetBeansProjects\\Archivo1\\aaaa.txt");//accede a un archivo. tiene que estar en el mismo paquete que se crea el proyecto
         System.out.println(file.exists()); //comprueva si el archivo existe o no
        if(!file.exists()){
            try
            {
                file.createNewFile();
                System.out.println(file.getName()+"Archivo creado!!!");
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
        System.out.println("Nombre: "+file.getName());
        System.out.println("Ruta absoluta: "+file.getAbsolutePath());
        System.out.println("Ruta: "+file.getPath());
        System.out.println("Se puede leer: "+file.canRead());
        System.out.println("Se puede escribir: "+file.canWrite());
        System.out.println("Se puede exeutar: "+file.canExecute());
        System.out.println("Es un directorio: "+file.isDirectory());
        System.out.println("Ultima modificacion: "+file.lastModified());
        System.out.println("Tamaño:"+file.length());
    }
    
}
