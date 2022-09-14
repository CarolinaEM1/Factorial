/*
 Pedir un número y calcular su factorial
 */
package ejercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        long factorial=1;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        for (int i=1; i<=numero; i++){
            factorial *=i; //multiplicación iterativa 
        }
        System.out.println("El factorial de "+numero+" es: "+factorial);
               
        
    }
    
}
