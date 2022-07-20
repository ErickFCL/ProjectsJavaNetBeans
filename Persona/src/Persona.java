
public class Persona {
    public String nombre;
    public String tipo;
    public String genero;

    public Persona() {
    }

    public Persona(String nombre, String tipo, String genero) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", tipo=" + tipo + ", genero=" + genero + '}';
    }
   
}
