public class App {
    public static void main(String[] args) throws Exception {

       //Creacion de carrera
       Carrera programadorDeSistemas = new Carrera("Programador de Sistemas", 10);
       System.out.println("Carrera creada: " + programadorDeSistemas.getNombreCarrera());
       
       //Creacion de estudiantes    
        Estudiante lucas = new Estudiante("Lucas", "Chavez", 26, "Programador de Sistemas", 0.0, 5);
        Estudiante lucia = new Estudiante("Lucia", "Suarez", 21, "Programador de Sistemas", 0.0, 5);
        Estudiante ana = new Estudiante("Ana", "Lucero", 18, "Programador de Sistemas", 0.0, 5);

        //Agregar estudiantes a la carrera
        programadorDeSistemas.agregarEstudiante(lucas);
        programadorDeSistemas.agregarEstudiante(lucia);
        programadorDeSistemas.agregarEstudiante(ana);

        //Creacion y asignacion de materias
        Materia prog1 = new Materia("Programacion 1", "P01", 10, 8.0);
        Materia mat1 = new Materia("Matematica 1", "P002", 8, 7.6);
        Materia ing1 = new Materia("Ingles Tecnico 1", "P003", 5, 10.0);
        Materia bd = new Materia("Base de datos", "P004", 9, 8.5);

        System.out.println("Asignacion de materias: ");

        lucas.agregarMateria(mat1);
        lucas.agregarMateria(ing1);
        lucas.agregarMateria(prog1);
        lucia.agregarMateria(prog1);
        lucia.agregarMateria(ing1);
        lucia.agregarMateria(mat1);
        ana.agregarMateria(bd);
        ana.agregarMateria(prog1);

        //Promedio de cada estudiante
        System.out.println("Listado de promedios: ");

        lucas.calcularPromedio();
        lucia.calcularPromedio();
        ana.calcularPromedio();
       

        System.out.println("Promedio final de Lucas: " + String.format("%.2f", lucas.getPromedio()));
        System.out.println("Promedio final de Lucia: " + String.format("%.2f", lucia.getPromedio()));
        System.out.println("Promedio final de Ana: " + String.format("%.2f", ana.getPromedio()));


        //Lista de todos los estudiantes de la carrera
        programadorDeSistemas.listarEstudiantes();
        
    }
}


