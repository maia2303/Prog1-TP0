import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private String direccion;
    private List<Estudiante> estudiantes; //lista de estudiantes (no 1)
    
    public Universidad () {//constructor sin parametros
        nombre = " ";
        direccion = " ";
        estudiantes = new ArrayList<>();

    }

    public Universidad (String nombre, String direccion) { //con parametros
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacio.");
        } else {
            this.nombre = nombre;
        }
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        if(direccion == null || direccion.trim().isEmpty()) {
            System.out.println("La dirección no puede estar vacia.");
        } else {
            this.direccion = direccion;
        }
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    
}
