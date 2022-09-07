/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author Dibah
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Testando a incompatibilidade de String e valor Integer.toString()
        // Classe invólucro
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
        
        // Uma String recebendo valor. Utiliza-se Integer.parseInt()
        /*String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);*/
        
        // Números reais
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.println(idade);
        
    }
    
}
