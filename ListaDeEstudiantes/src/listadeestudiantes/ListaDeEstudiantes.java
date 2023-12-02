// Segundo Caso colegiado, Jorge David Duran Bolaños, curso SC-202.
package listadeestudiantes;

//  Importar Liberias Necesarias:
import javax.swing.JOptionPane;

public class ListaDeEstudiantes {

    public static void main(String[] args) {
        //  Declarar instancia para clase Operaciones:
        Operaciones Operaciones = new Operaciones();
        
        //  Variable de apoyo:
        String resultado = "";
        int tamanio = 10;
        
        //  Crear arreglo Unidimensional:
        Estudiante arrEstudiante[] = new Estudiante[tamanio];
        
        // Ingresar datos para el arreglo:
        for (int i = 0; i < arrEstudiante.length; i++) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos para el alumno "+(i+1)+". ");
            String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno: ");
            String Curso = JOptionPane.showInputDialog("Ingrese el curso del alumno: ");
            String Profesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
            double Nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota obtenida: "));
            
            arrEstudiante[i] = new Estudiante(Nombre, Curso, Profesor, Nota);
        } 
        
        //  Imprimir los datos del arreglo:
        for (int i = 0; i < arrEstudiante.length; i++) {
            //  Convertir los datos en el formato String:
            resultado += (i+1)+" "+arrEstudiante[i].toString() + "\n" ;
        }
        //  Imprimir el resultado:
        JOptionPane.showMessageDialog(null, resultado);
        
        //  Imprimir el promedio:
        Operaciones.Promedio(arrEstudiante);
        //  Imprimir las notas menores al promedio:
        Operaciones.NotasMenores(arrEstudiante);
        //  Imprimir las notas mayores al promedio:
        Operaciones.NotasMayores(arrEstudiante);
        //  Imprimir el estudiante con la menor nota:
        Operaciones.MenorNota(arrEstudiante);
        //  Imprimir el estudiante con la mayor nota:
        Operaciones.MenorNota(arrEstudiante);
        
    }
}
