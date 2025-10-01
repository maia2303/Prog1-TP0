public class Estudiante {
   public String nombre; //usar mayúscula en String
   public String apellido;
   public int edad; 
   public String carrera;
   public float promedio;

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



