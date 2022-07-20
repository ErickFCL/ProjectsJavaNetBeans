
package herenciamultiple;

public class Hormiga extends Animal implements iMovil{
    private String tipo;
    @Override
    public void mover() {
        System.out.println("La hormiga se mueve sobre sus pies");
    }

    public Hormiga() {
    }

    public Hormiga(String tipo, String tipoAnimal) {
        super(tipoAnimal);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
