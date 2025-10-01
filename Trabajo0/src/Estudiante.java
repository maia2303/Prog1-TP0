public class Estudiante {
   private String nombre; //usar mayúscula en String
   private String apellido;
   private int edad; 
   private String carrera;
   private double promedio;

   public Estudiante () { //constructor sin parámetros
        nombre = " ";
        apellido = " ";
        edad = 0;
        carrera = " ";
        promedio = 0.0;
    }

    public Estudiante (String nombre, String apellido, int edad, String carrera, double promedio) { //constructor con parámetros
        this.setNombre(nombre); //inicializa todos los parámetros usando this
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setCarrera(carrera);
        this.setPromedio(promedio);

    }  
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacio.");
        } else {
         this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido){
        if (apellido == null || apellido.trim().isEmpty()) { //es obligatorio
            System.out.println("El apellido no puede estar vacio.");
        } else {
         this.apellido = apellido;
        }
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad > 16) {
         this.edad = edad;   
        } else {
            System.out.println("La edad debe ser mayor a 16 años.");
        }
        
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
          this.promedio = promedio;  
        } else {
            System.out.println("El promedio debe estar entre 0 y 10");
        }
        
    }

    
}



