/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author Dibah
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int cc = 0;
        while (cc<4) { // Enquanto o cc for menor que 4, cambalhota
            System.out.println("Cambalhota " + cc); //Exibe o valor da cambalhota 
            cc++; // cc recebe ele mesmo + 1
        }*/
        /*int cc = 0; // Pode ser iniciado por 1, para não exibir o ZERO
        while (cc<4) { // Enquanto o cc for menor que 4, cambalhota, ou 
            //(cc<=4) para não exibir o ZERO    
            //Exibe o valor da cambalhota, começando em 1 
            System.out.println("Cambalhota " + (cc+1)); 
            cc++; // cc recebe ele mesmo + 1
    }*/
        // Utilizando o comando continue
        /*int cc = 0;
        while (cc<10) {// Teste para 10 cambalhotas
            cc++;
            // Teste da condição continue. Não mostra na tela. Volta para o while
            if(cc == 5 || cc == 7 || cc == 9){ 
                continue;
            }
            System.out.println("Cambalhota " + (cc)); 
        }*/
        
        // Comando break. Joga para fora do laço.
        int cc = 0;
        while (cc<10) {// Teste para 10 cambalhotas
            cc++;
            // Teste da condição continue. Não exibe 2, 3, 4
            if(cc == 2 || cc == 3 || cc == 4){ 
                continue;
            }
            // Executa o comando até chegar no 7. Ai sai.
            if(cc == 7) {
               break;    
            }
            System.out.println("Cambalhota " + (cc)); 
        }
    }
}
