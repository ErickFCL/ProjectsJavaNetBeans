package baniosdelinca;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class BaniosDelInca{
    static Scanner lector = new Scanner (System.in);
    private static String FILE_NAME = "sauna.txt";
    public static void main(String[] args) {
        System.out.println("cuantos: ");
        String [] text = new String[20];
        int n = lector.nextInt();
       // InputStream.skip();
           try{
               for (int i = 0; i < n; i++) {
                    System.out.print("Nombre: ");
                    text[i]  = lector.nextLine();
                    FileWriter output = new FileWriter(FILE_NAME);
                    for (int j = 0; j < text[i].length(); j++) {
                        output.write(text[i].charAt(j));
                        
                 }
                    output.close();
            }
            
        }
        catch(IOException ex){
            System.out.println(";(");
        }
        
        
    }


    
}
