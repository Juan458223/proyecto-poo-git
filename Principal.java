
//Probando desde Github :)
public class Principal {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Sistema de Gestión");

        Tarea t1 = new Tarea(1, "Diseñar base de datos", "Crear tablas y relaciones");
        Tarea t2 = new Tarea(2, "Implementar API", "Desarrollar endpoints REST");
        Tarea t3 = new Tarea(3, "Crear interfaz gráfica", "Diseñar pantallas en JavaFX");

        proyecto.agregarTarea(t1);
        proyecto.agregarTarea(t2);
        proyecto.agregarTarea(t3);

        t2.completar();

        proyecto.mostrarTareas();
    }
}
