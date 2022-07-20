
package proyectoherencia;

public class Persona {
    protected String paterno;
    protected String materno;
    protected String nombre;
    protected int codigo;
    public Persona() {
    }

    public Persona(String paterno, String materno, String nombre) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        //generar codigo 
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void imprimir(){
        System.out.println("Codigo: "+ this.getCodigo()+
                "\tPaterno: "+this.getPaterno()+
                "\tMaterno: "+this.getMaterno()+
                "\tNombre: "+this.getNombre());
    }
    
}
