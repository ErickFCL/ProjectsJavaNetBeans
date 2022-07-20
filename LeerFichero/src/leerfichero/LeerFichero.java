
package leerfichero;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LeerFichero {
    private static final String FILE_NAME="sauna.txt";
    private static final String Nombre ="";
    public static void main(String[] args) {
       FileReader input = null;
       try{
           CharCounter counters = new CharCounter(Nombre, false);
           input = new FileReader(FILE_NAME);
           int c;
           while((c = input.read()) != -1){
               counters.contIfTargeted((char)c);
           }
           System.out.println(counters);
       }catch(FileNotFoundException ex){
        System.out.println("Problemas opening " + FILE_NAME);     
       }catch(IOException ex){
           System.out.println("Problema reading "+ FILE_NAME);
       }finally{
           try{
               file.close();
           }catch(IOException ex){
               System.out.println("Problemas al cerrar "+ FILE_NAME);
           }
       }
    }
    
}
