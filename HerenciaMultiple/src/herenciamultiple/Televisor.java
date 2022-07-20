
package herenciamultiple;

public class Televisor extends Maquina implements iSonoro{
    private String tamanio;
    @Override
    public void emitir() {
        System.out.println("El televisor tilin !!! ");
    }

    public Televisor() {
    }

    public Televisor(String tamanio, String tipoMaquina) {
        super(tipoMaquina);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    
    
    
    
}
