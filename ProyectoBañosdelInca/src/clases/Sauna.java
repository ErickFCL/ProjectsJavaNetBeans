package clases;
public class Sauna extends Servicio{
    protected String temperatura;

    public Sauna() {
    }

    public Sauna(String temperatura, double tiempo, int cantidad, int precio, String tipo, String nombre, String apellido, String dni, String procedencia, int anio, int mes, int dia) {
        super(tiempo, cantidad, precio, tipo, nombre, apellido, dni, procedencia, anio, mes, dia);
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    
}
