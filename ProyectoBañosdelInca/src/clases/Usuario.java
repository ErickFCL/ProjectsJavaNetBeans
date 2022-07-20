package clases;
public class Usuario {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String procedencia;
    protected int anio;
    protected int mes;
    protected int dia;
    

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni, String procedencia, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.procedencia = procedencia;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

   
}
