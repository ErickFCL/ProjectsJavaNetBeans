
package herenciamultiple;

public class Tostadora extends Maquina{
    private String tipo;

    public Tostadora() {
    }

    public Tostadora(String tipo, String tipoMaquina) {
        super(tipoMaquina);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public static void encender(){
        System.out.println("Encendido");
    }
    
}
