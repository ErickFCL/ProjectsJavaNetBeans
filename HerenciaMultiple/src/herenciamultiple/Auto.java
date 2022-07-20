package herenciamultiple;
public class Auto extends Maquina implements iMovil,iSonoro{
    private String nombre;
    @Override
    public void mover() {
        System.out.println("El auto se mueve sobre sus cuatro llantas");
    }

    @Override
    public void emitir() {
        System.out.println("El auto tiiii tiii tii!!!" );
    }

    public Auto() {
    }

    public Auto(String nombre, String tipoMaquina) {
        super(tipoMaquina);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
