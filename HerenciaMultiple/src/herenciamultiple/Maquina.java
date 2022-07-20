
package herenciamultiple;

public class Maquina {
    protected String tipoMaquina;

    public Maquina() {
    }

    public Maquina(String tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }

    public String getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(String tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }
    
}
