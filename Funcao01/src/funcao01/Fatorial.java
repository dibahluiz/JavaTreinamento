/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao01;

/**
 *
 * @author Dibah
 */
public class Fatorial {
    // Classe do fatorial
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    //Método set valor, pra preencher o valor
    public void setValor(int n){
        num = n;
        int f = 1;
        String s = "";
        for (int c = n; c>1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    // Pega o fatorial
    public int getFatorial() {
        return fat;
    }
    // Pega a fórmula
    public String getFormula() {
        return formula;
    }
        
}
