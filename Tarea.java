public class Tarea {
    private int id;
    private String nombre;
    private String contenido;
    private boolean estado;

 public Tarea(int id, String nombre, String contenido) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.completada = false;
    }

    public void completar() {
        this.estado = true;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public boolean isCompletada() {
        return estado;
    }
}
