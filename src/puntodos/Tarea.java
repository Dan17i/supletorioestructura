package puntodos;
public class Tarea {
    private String nombre;
    private String descripcion;

    // Constructor
    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Método toString para representar la tarea
    @Override
    public String toString() {
        return nombre + " | " + descripcion;
    }
}

