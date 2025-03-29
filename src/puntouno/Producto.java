package puntouno;
public class Producto implements Comparable<Producto> {
    private String nombre;
    private int stock;
    private double precio;

    // Constructor
    public Producto(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    // Método compareTo para ordenar por nombre de manera natural
    @Override
    public int compareTo(Producto otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return nombre + " - Stock: " + stock + ", Precio: $" + precio;
    }

}

