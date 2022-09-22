/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author Dibah
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};// Opção 1 ou int n[] = new int [4], declarando casa variável.
        System.out.println("Total de casas de N " + n.length);// Lenght é comprimento. É um atributo. Informa o tamanho 
        /*for (int c=0; c<=5; c++)*/
        for (int c=0; c<=n.length-1; c++)// Vai de zero até - length 
        {
            //System.out.println(c);//Mostra as posições
            //System.out.println(n[c]);// Mostra os valores//
            System.out.println("Na posicao " + c + " temos o valor " + n[c]);
        }
    }
    
}
