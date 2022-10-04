/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
// Importar a classe dos painéis do JAVA
import javax.swing.JOptionPane;

/**
 *
 * @author Dibah
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Exemplo de painel. O formato nos parênteses é nome da janela e mensagem.
        // No exemplo abaixo a janela ficou sem nome, ou seja, null.
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas",JOptionPane.INFORMATION_MESSAGE);
        
        // Aceita janela para digitar um número.
        /*int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
        // Exibe mensagme com o valor digitado
        JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);*/
        
        // Estrutura de repetição. Enquanto o n for diferente de 0, exibe na tela. Quando digitar 0, ele para.
        int n, s=0;
        do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                   "<html>Informe um número: <br><en>(valor 0 interrompe)</en></html>" ));
           s += n;
        }while(n !=0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" +
                "<br>Somatório vale " + s + "</html>");
        
    }
    
}
