public class Producto {
    protected String nombre;
    protected String marca;
    protected String color;
    protected int nTaco;
    protected String material;
    protected int stock;

    public Producto() {
    }

    public Producto(String nombre, String marca, String color, int nTaco, String material, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.nTaco = nTaco;
        this.material = material;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getnTaco() {
        return nTaco;
    }

    public void setnTaco(int nTaco) {
        this.nTaco = nTaco;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
