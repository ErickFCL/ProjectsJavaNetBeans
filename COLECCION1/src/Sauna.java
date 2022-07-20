
public class Sauna {

   
    public String nombre;
    public int codigo;

    public Sauna() {
    }

    public Sauna(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
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

    @Override
    public String toString() {
        return "Sauna{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
    
  }
