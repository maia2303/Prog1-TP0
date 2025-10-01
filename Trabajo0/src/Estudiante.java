public class Estudiante {
   private String nombre; //usar mayúscula en String
   private String apellido;
   private int edad; 
   private String carrera;
   private float promedio;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println(("El nombre no puede estar vacio"));
        } else {
         this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido){
        if (apellido == null || apellido.trim().isEmpty()) {
            System.out.println(("El apellido no puede estar vacio"));
        } else {
         this.apellido = apellido;
        }
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Estudiante () { //constructor sin parámetros
        nombre = " ";
        apellido = " ";
        edad = 0;
        carrera = " ";
        promedio = 0.0f;
    }

    public Estudiante (String nombre, String apellido, int edad, String carrera, float promedio) { //constructor con parámetros
        this.nombre = nombre; //inicializa todos los parámetros usando this
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;

    }  
}



