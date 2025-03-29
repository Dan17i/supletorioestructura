import puntouno.Almacen;
import puntouno.Producto;

import java.util.Iterator;
/**
 * 1.(usar solo iteradores no ciclos) Diseñar una clase genérica Almacén<T> que gestione una colección de productos almacenados, permitiendo recorrerlos mediante un iterador. Cada Producto debe contar con un nombre, stock y un precio, y la colección debe ofrecer la funcionalidad de ordenarlos de menor a mayor precio mediante un comparador específico, garantizando una organización eficiente de los productos registrados. Se resalta que cada producto tiene un orden natural de ordenamiento definido por el nombre.
 * @author Daniel Jurado
 */
public class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto p1 = new Producto("Apple", 100, 2.5);
        Producto p2 = new Producto("Banana", 150, 1.5);
        Producto p3 = new Producto("Cherry", 80, 3.0);

        // Crear un almacén
        Almacen<Producto> almacen = new Almacen<>();

        // Agregar productos al almacén
        almacen.agregarProducto(p1);
        almacen.agregarProducto(p2);
        almacen.agregarProducto(p3);

        // Mostrar productos antes de ordenar
        System.out.println("Los productos antes de ordenar por precio:");
        System.out.println("------------------------------------------");
        almacen.mostrarProductos();

        // Ordenar productos por precio
        almacen.ordenarPorPrecio();

        // Mostrar productos después de ordenar
        System.out.println("\nProductos después de ordenar por precio:");
        System.out.println("------------------------------------------");
        almacen.mostrarProductos();

        // Recorrer los productos usando el iterador
        System.out.println("\nRecorriendo productos con iterador:");
        System.out.println("---------------------------------------");
        Iterator<Producto> iterador = almacen.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
