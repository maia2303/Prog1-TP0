public class Universidad {
    private String nombre;
    private String direccion;
    private Estudiante estudiantes[]; //declarar un array estudiante
    private int cantEstudiantes;
   

    public Universidad (String nombre, String direccion, int cantEstudiantes) { //con parametros
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.estudiantes = new Estudiante[cantEstudiantes]; //crear el array con capacidad
        this.cantEstudiantes = 0;     
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

    
}
