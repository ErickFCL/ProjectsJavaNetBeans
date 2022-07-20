package escribirfichero;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero{
    static Scanner lector = new Scanner (System.in);
    private static String FILE_NAME = "ejemplo.txt";
    public static void main(String[] args) {
        try{
            System.out.println("texto: ");
            String text = lector.nextLine();
            FileWriter output = new FileWriter(FILE_NAME);
            for (int i = 0; i < text.length(); i++) {
          
               output.write(text.charAt(i));
              
                   
            }
            output.close();
        }
        catch(IOException ex){
            System.out.println(";(");
        }
    }


    
}
