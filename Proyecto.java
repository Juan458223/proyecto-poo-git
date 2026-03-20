import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareas() {
        System.out.println("Proyecto: " + nombre);
        for (Tarea t : tareas) {
            System.out.println("- ID: " + t.getId() +
                               " | Nombre: " + t.getNombre() +
                               " | Contenido: " + t.getContenido() +
                               " | Completada: " + t.isCompletada());
        }
    }
}