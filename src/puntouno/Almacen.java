package puntouno;
import java.util.*;

public class Almacen<T extends Producto> {
    private List<T> productos;

    // Constructor
    public Almacen() {
        productos = new ArrayList<>();
    }

    // Agregar producto al almacén
    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    // Ordenar productos por precio utilizando el comparador
    public void ordenarPorPrecio() {
        productos.sort(new ComparadorPrecio());
    }

    // Obtener un iterador para recorrer los productos
    public Iterator<T> iterator() {
        return productos.iterator();
    }

    // Método para mostrar los productos almacenados
    public void mostrarProductos() {
        for (T producto : productos) {
            System.out.println(producto);
        }
    }
}

