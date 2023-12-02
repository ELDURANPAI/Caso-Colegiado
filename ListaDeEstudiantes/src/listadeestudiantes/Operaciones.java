//  Clase orientada a realizar las operaciones requeridas:

package listadeestudiantes;

import javax.swing.JOptionPane;

public class Operaciones {
    //  Variables de apoyo:
    
    //  Para promedio:
    private double suma = 0;
    private double promedio = 0;
    //  Para NotasMenores:
    private String resultado = "";
    //  Para NotasMayores:
    private String RESULTADO = "";
    //  Para MenorNota:
    private double NotaMenor = 0;
    private String ResultMenor = "";
    //  Para MayorNota:
    private double NotaMayor = 0;
    private String ResultMayor = "";
    
    
    
    //  Promedio de la nota:
    public void Promedio(Estudiante[] estudiante){
        for (int i = 0; i < estudiante.length ; i++){
            //  Sumar todas las notas:
            suma = suma + estudiante[i].getNota();
            //  Sacar el promedio de todas las notas:
            promedio = suma / estudiante.length;
        }
        //  Imprimir los resultados:
        JOptionPane.showMessageDialog(null, "El promedio de las notas es: "+promedio);
    
    }
    
    //  Calificaciones menores al promedio:
    public void NotasMenores(Estudiante[] estudiante){
        for (int i = 0; i < estudiante.length; i++) {
            //  Validar que la nota sea menor al promedio
            if (estudiante[i].getNota() < promedio){
                resultado += estudiante[i].toString() + "\n" ;
            }
        }
        //  Imprimir Resultados:
            JOptionPane.showMessageDialog(null, "Estudiantes con notas menores al promedio: \n\n"+resultado);
    }
    
    //  Calificaciones mayores al promedio:
    public void NotasMayores(Estudiante[] estudiante){
        for (int i = 0; i < estudiante.length; i++) {
            //  Validar que la nota sea mayor al promedio
            if (estudiante[i].getNota() > promedio){
                RESULTADO += estudiante[i].toString() + "\n" ;
            }
        }
        //  Imprimir Resultados:
            JOptionPane.showMessageDialog(null, "Estudiantes con notas mayores al promedio: \n\n"+RESULTADO);
    }
    
    //  Estudiante con la menor nota:
    public void MenorNota(Estudiante[] estudiante) {
        for (int i = 0; i < estudiante.length; i++) {
            // variable "nota menor" es igual a la nota del estudiante en la posicion i
            NotaMenor = estudiante[i].getNota();
            
            //evaluar que la nota del estudiante i sea menor a la variable "nota menor" 
            if (estudiante[i].getNota() <= NotaMenor ){
                ResultMenor = estudiante[i].toString();
            }
        }
        //  Imprimir resultados:
            JOptionPane.showMessageDialog(null, "El estudiante con la nota menor es: \n"+ResultMenor);
        
    }
    
    //  Estudiante con la mayor nota:
    public void MayorNota(Estudiante[] estudiante) {
        for (int i = 0; i < estudiante.length; i++) {
            // variable "nota mayor" es igual a la nota del estudiante en la posicion i
            NotaMayor = estudiante[i].getNota();
            
            //evaluar que la nota del estudiante i sea mayor a la variable "nota mayor"
            if (estudiante[i].getNota() <= NotaMayor ){
                ResultMayor = estudiante[i].toString();
            }
        }
        //  Imprimir resultados:
            JOptionPane.showMessageDialog(null, "El estudiante con la nota menor es: \n"+ResultMayor);
        
    }
    
    
}
