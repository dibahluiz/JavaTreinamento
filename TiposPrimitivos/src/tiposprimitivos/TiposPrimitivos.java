/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Dibah
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Outra forma de escrever --> float nota = (float) 8.5
        /*float nota = 8.5f;
        System.out.printf("Sua nota e %.2f \n", nota);
        O % indica formatação da nota e o \n o salto de linha. Atenção que 
        precisa usar System.out.printf */
        
        // Outro exemplo, adicionando String (recebe %s) com nome.
        /*String nome = "Gustavo";
        float nota = 8.5f;
        System.out.printf("Sua nota de %s e %.2f \n",nome, nota);*/
        
        // Utilizando System.out.format
        /*String nome = "Gustavo";
        float nota = 8.5f;
        System.out.format("Sua nota de %s e %.2f \n",nome, nota);*/
        
        // Utilizando entrada de dados. Quando der o alerta na lâmpada da
        // esquerda, basta clicar nela e importar o Scanner.
        // A String lerá um nome e o float um número.
        
        /*Scanner teclado = new Scanner (System.in);
        String nome = teclado.nextLine();
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s e %.2f \n", nome, nota);*/
        
        // Incrementando com mensagens e fazendo cálculo da média.
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota 1 do aluno: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Digite a nota 2 do aluno: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2) /2;
        System.out.format("A media do aluno e " + media);
    }
    
}
