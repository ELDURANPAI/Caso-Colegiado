//  Clase orientada a cada Estudiante:

package listadeestudiantes;

public class Estudiante {
    
    //  Atributos:
    private String Nombre;
    private String Curso;
    private String Profesor;
    private double Nota;
    
    //  Constructor:
    
    public Estudiante() {
    }

    public Estudiante(String Nombre, String Curso, String Profesor, double Nota) {
        this.Nombre = Nombre;
        this.Curso = Curso;
        this.Profesor = Profesor;
        this.Nota = Nota;
    }
    
    // Getters and Setters:

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public String getProfesor() {
        return Profesor;
    }

    public double getNota() {
        return Nota;
    }

    //  Formato para almacenar los datos:
    @Override
    public String toString() {
        return "Estudiante: [" + "Nombre= " + Nombre + ", Curso= " + Curso + ", Profesor= " + Profesor + ", Nota= " + Nota + " ]";
    }

    
    
    
    
    
}
