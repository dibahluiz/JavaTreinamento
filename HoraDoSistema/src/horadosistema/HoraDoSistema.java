/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.util.Date;

/**
 *
 * @author Dibah
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Atribuir a data atual no Java. Importar o Java Util Date.
        Date relogio = new Date();// new cria um novo objeto
        System.out.println("A hora do sistema e ");
        System.out.println(relogio.toString());
        
    }
    
}
