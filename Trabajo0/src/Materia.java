public class Materia {
    private String nombreM; //nombre materia
    private String codigoM;
    private int creditos;
    private double calificacion;

    public Materia () { //constructor sin parámetros
        nombreM = " ";
        codigoM = " ";
        creditos = 0;
        calificacion = 0.0;
    }

    public Materia (String nombreM, String codigoM, int creditos, double calificacion) {
        this.setNombreM(nombreM);
        this.setCodigoM(codigoM);
        this.setCreditos(creditos);
        this.setCalificacion(calificacion);

    }


    public String getNombreM() {
        return nombreM;
    }
    public void setNombreM(String nombreM) {
        if (nombreM == null || nombreM.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacio.");
        } else {
         this.nombreM = nombreM;
        }
    }

    public String getCodigoM() {
        return codigoM;
    }
    public void setCodigoM(String codigoM) {
        this.codigoM = codigoM;
    }

    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
         this.calificacion = calificacion;   
        } else {
            System.out.println("La calificación debe estar entre 0 y 10");
        }     
    }
}
