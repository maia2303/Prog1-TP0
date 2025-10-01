public class App {
    public static void main(String[] args) throws Exception {
       
        Estudiante e1 = new Estudiante(); //constructor sin parámetros
        
        Estudiante e2 = new Estudiante("Lucas", "Chavez", 26, "Ingeniería en Sistemas", 8.0);
        //constructor con parámetros
        Estudiante e3 = new Estudiante("Lucía", "Suarez", 21, "Electrónica", 9.8);

        Estudiante[] estudiantes = { e1, e2, e3 }; //array para almacenar y recorrer

        for (int i = 0; i < 3; i++) {
        System.out.println("Nombre: " + estudiantes[i].nombre + ", Promedio: " + estudiantes[i].promedio);
        }
    }
}


