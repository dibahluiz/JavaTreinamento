/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Dibah
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0; // Número e soma
        String resp;
        Scanner teclado = new Scanner(System.in); //Informação a ser digitada na tela. Precisa importar o Scanner
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            s += n;// s = s + n
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next(); // Ler a resposta
        } while (resp.equals("S"));// Enqaunto a resposta for Sim fará o processo
        System.out.println("A soma de todos os valores e " + s);
    }
    
}
