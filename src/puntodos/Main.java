package puntodos;
/**

 *
 *
 * (1.25) (usar solo iteradores no ciclos) En un sistema de gestión de tareas, se requiere una estructura que almacene actividades pendientes y permita recorrerlas en orden inverso, priorizando las más recientes. Diseñar una clase GestorTareas<T> que mantenga una colección de tareas en una lista, permitiendo agregar, eliminar y buscar tareas de manera eficiente. Además, implementar un iterador personalizado que facilite la navegación desde la tarea más reciente hasta la más antigua, optimizando el seguimiento y la administración del flujo de trabajo.
 *
 * @author Daniel Jurado
 */
public class Main {
    public static void main(String[] args) {
        // Crear tareas
        Tarea tarea1 = new Tarea("Tarea 1", "Descripción de la tarea 1");
        Tarea tarea2 = new Tarea("Tarea 2", "Descripción de la tarea 2");
        Tarea tarea3 = new Tarea("Tarea 3", "Descripción de la tarea 3");

        // Crear el gestor de tareas
        GestorTareas<Tarea> gestor = new GestorTareas<>();

        // Agregar tareas al gestor
        gestor.agregarTarea(tarea1);
        gestor.agregarTarea(tarea2);
        gestor.agregarTarea(tarea3);

        // Mostrar tareas en orden inverso (de la más reciente a la más antigua)
        System.out.println("Tareas en orden inverso:");
        gestor.mostrarTareas();

        // Buscar tarea por nombre
        Tarea tareaEncontrada = gestor.buscarTarea("Tarea 2");
        if (tareaEncontrada != null) {
            System.out.println("\nTarea encontrada: " + tareaEncontrada);
        } else {
            System.out.println("\nTarea no encontrada.");
        }

        // Eliminar una tarea
        gestor.eliminarTarea(tarea2);
        System.out.println("\nTareas después de eliminar la tarea 2:");
        gestor.mostrarTareas();
    }
}

