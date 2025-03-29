package puntodos;
import java.util.*;

public class GestorTareas<T extends Tarea> {
    private LinkedList<T> tareas;

    // Constructor
    public GestorTareas() {
        tareas = new LinkedList<>();
    }

    // Agregar una nueva tarea
    public void agregarTarea(T tarea) {
        tareas.addFirst(tarea);  // Agregar tarea al principio (más reciente)
    }

    // Eliminar una tarea
    public boolean eliminarTarea(T tarea) {
        return tareas.remove(tarea);
    }

    // Buscar una tarea por nombre
    public T buscarTarea(String nombre) {
        for (T tarea : tareas) {
            if (tarea.getNombre().equals(nombre)) {
                return tarea;
            }
        }
        return null;  // Si no la encuentra
    }

    /*Crear un iterador que recorra las tareas en orden inverso (de la más reciente a la más antigua) */

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = tareas.size() - 1;  // Comenzamos desde la última tarea

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return tareas.get(index--);  // Devolvemos la tarea y movemos el índice hacia atrás
            }
        };
    }

    /**
     * Mostrar las tareas usando el iterador
     */
    public void mostrarTareas() {
        Iterator<T> iterador = iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}

