public class Carrera {
    private String nombreCarrera;
    private Estudiante estudiantes[]; //array estudiantes
    private int cantEstudiantes;

    public Carrera (String nombreCarrera, int cantEstudiantes) { //constructor
        this.setNombreCarrera(nombreCarrera);
        this.estudiantes = new Estudiante[cantEstudiantes];
        this.cantEstudiantes = 0;
    }

    public String getNombreCarrera(){
        return nombreCarrera;
    }
    public void setNombreCarrera(String nombreCarrera){
        if(nombreCarrera == null || nombreCarrera.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacio.");
        } else {
            this.nombreCarrera = nombreCarrera;
        }
    }
    public int getCantEstudiantes(){
        return cantEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){ 
        if (this.cantEstudiantes < this.estudiantes.length){
            this.estudiantes[this.cantEstudiantes] = estudiante;
            this.cantEstudiantes++;
            System.out.println("Estudiante" + estudiante.getNombre() + "inscripto en la carrera" + this.nombreCarrera + " ✅");
        } else {
            System.out.println("La carrera" + this.nombreCarrera + "ha alcanzado el máximo de inscriptos ⚠️");
        }
    }

    public void listarEstudiantes() { 
        if (cantEstudiantes == 0) {
            System.out.println("No hay estudiantes inscriptos en" + this.nombreCarrera + ".");
            return;
        } else {
            System.out.println("Estudiantes inscriptos en" + this.nombreCarrera + ":");
            for(int i = 0; i < this.cantEstudiantes; i++){
                Estudiante e = estudiantes[i];
                System.out.println("Estudiante" + e.getNombre() + " " + e.getApellido() + "-Edad: " + e.getEdad() + "-Promedio: " + e.getPromedio());
            }
        }
    }

    public void buscarEstudiante() {
        if (getNombre == null || getNombre.trim().isEmpty()) {
            System.out.println("Debe escribir un nombre para buscar.");
            return null;            
        } else {
            System.out.println("Buscando estudiante" + getNombre + "en " + getNombreCarrera() + "...");
        }
        for(int i = 0; i < this.cantEstudiantes; i++){
            Estudiante e = estudiantes[i];
            if (e.getNombre().equalsIgnoreCase(getNombre.trim())) {
                System.out.println("✅ Estudiante encontrado" + e.getNombre() + " " + e.getApellido());
                return e;
            }
            System.out.println("❌ Estudiante" + getNombre() + "no encontrado en" + this.getNombreCarrera());
            return null;
        }
    }

}
