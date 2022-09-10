/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Dibah
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Necessário importar a classe Scanner, através do clique na lâmpada.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        // Clacular a média
        float m = (n1+n2)/2;
        // Exibir na tela o texto e a média.
        System.out.println("Sua media foi " + m);
        // Escrever a condição if. Se a média foi maior que 9 escreve Parabéns.
        if (m>9) { 
            System.out.println("Parabens!");
        }
    }
    
}
