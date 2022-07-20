package herenciamultiple;
public class Gato extends Animal implements iMovil,iSonoro{
    private String nombre;
    @Override
    public void mover() {
        System.out.println("El Gato se mueve sobre sus cuatro patitas");
    }

    @Override
    public void emitir() {
        System.out.println("miau!!! miau!!!");
        
    }

    public Gato() {
    }

    public Gato(String nombre, String tipoAnimal) {
        super(tipoAnimal);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

  

    
}
