/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import static java.lang.System.in;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Dibah
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner t = new Scanner(System.in); // Declara a classe Scanner
        System.out.print("Em que ano voce nasceu? ");
        int nasc = t.nextInt();
        Calendar cal = GregorianCalendar.getInstance();
        //System.out.println(cal.get(Calendar.YEAR));
        int i = cal.get(Calendar.YEAR) - nasc;
        if (i>=18){
            System.out.println("Maior de idade "); // Maior de 18
        }else {
            System.out.println("Menor de idade "); // Menor de 18
        }*/
        Scanner t = new Scanner(System.in); // Declara a classe Scanner
        System.out.print("Em que ano voce nasceu? ");
        int nasc = t.nextInt();
        // Buscar o ano atual
        Calendar cal = GregorianCalendar.getInstance();
        //System.out.println(cal.get(Calendar.YEAR));
        // Ano atual - o ano informado
        int i = cal.get(Calendar.YEAR) - nasc; 
        if (i>=18){
            System.out.println("Maior de idade. " + "Voce tem " + 
                    i + " anos."); // Maior de 18
        }else {
            System.out.println("Menor de idade. " + "Voce tem " +
                    i + " anos."); // Menor de 18
        }
    }
    
}
