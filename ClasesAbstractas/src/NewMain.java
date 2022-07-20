
import javax.swing.JOptionPane;


public class NewMain {

    public static void main(String[] args) {
        Empleado [] e = new Empleado[3];
        e[0] = new Categoria1(true, 1300, 0, 3, 0, 0, "ABC", "Erick");
        e[1] = new Categoria2(2, 1500, 25000, 0, 8, 0, 0, "Ventas", "Ana");
        e[2] = new Categoria3(36, 40, 25, 0, 10, 0, 0, "Horas", "Iris");
        
        String salida="";
        for (int i = 0; i < e.length; i++) {
           
            e[i].calcularBonos();
            e[i].calcularDescuentos();
            e[i].calcularSueldo();
             salida += e[i].toString();
            if(e[i] instanceof Categoria1){
                salida+="Es empleado de sueldo fijo\n";
                Categoria1 c = new Categoria1();
                c = (Categoria1)e[i];
                JOptionPane.showMessageDialog(null, c.toString()+" tipo de clase: "+ c.getClass().getName(), "ABC", 1);
                
            }else if(e[i] instanceof Categoria2){
                salida +="Es empleado de sueldo por comision\n";
            }else if(e[i] instanceof Categoria3){
                salida +="Esempleado por horas\n";
            }else
                salida += "Empleado incorrecto!!!\n";
            
        }
        JOptionPane.showMessageDialog(null, salida, null, 2);
    }
    
}
