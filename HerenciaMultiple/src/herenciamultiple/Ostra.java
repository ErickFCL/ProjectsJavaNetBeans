
package herenciamultiple;

public class Ostra extends Animal{
    private double tamanio;

    public Ostra() {
    }

    public Ostra(double tamanio, String tipoAnimal) {
        super(tipoAnimal);
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Ostra{" + "tamanio=" + tamanio + '}';
    }
    
    
}
