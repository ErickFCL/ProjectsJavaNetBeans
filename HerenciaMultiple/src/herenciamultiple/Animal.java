
package herenciamultiple;

public class Animal {
    protected String tipoAnimal;

    public Animal() {
    }

    public Animal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    
}
