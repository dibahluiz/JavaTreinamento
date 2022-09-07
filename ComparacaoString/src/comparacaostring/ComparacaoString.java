/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Dibah
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Comparando Strings, nome1 e nome2
        /*String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        String res;
        res = (nome1 == nome2)?"igual":"diferente";
        System.out.println(res);*/
        
        // nome1 ou nome2 comparando com o nome3 é diferente
        // Como foi instanciado com new é diferente.
        // Utilizando o operador equal é possível comparar o conteúdo.
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        
            
    }
    
}
