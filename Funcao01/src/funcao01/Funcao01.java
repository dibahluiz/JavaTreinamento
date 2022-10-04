/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao01;

/**
 *
 * @author Dibah
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Será criado um novo objeto de fatorial
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.print(f.getFormula()); // Mostra a fórmula
        System.out.println(f.getFatorial());// Mostra o fatorial
    }
    
}
