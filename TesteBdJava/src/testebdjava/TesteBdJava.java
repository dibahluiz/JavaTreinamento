/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testebdjava;

/**
 *
 * @author Dibah
 */
// Importação de classes
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;


public class TesteBdJava {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
            // TODO code application logic here
            Connection con; // Criar o objeto da classe Connection
            Statement st; // Criar o objeto da classe Statement
            /* É necessário adiconar o drive da conexão que foi baixado. No lado
            esquerdo, em Libraries, clicar com o botão direito, add/JAVA Folder e
            selecionar o drve saldo*/
            Class.forName("com.mysql.jdbc.Driver");// Informando o uso do pacote. Quando der o erro, clicar na Lâmpada
            // e depois na opção "Try catch"
            // Linha da conexão com o BD
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdjava","root","");//Local, usuário, senha
            // Sessão, autorização
            st = con.createStatement();
            st.executeUpdate("Insert into cadastro values ('1234', 'Cli/For', 'End', 'C');");// Comando a ser executado no SQL
            System.out.println("Dados inseridos com sucesso ");  
        } catch (ClassNotFoundException ex) {
            System.out.println("O Drive não esta na bic=blioteca ");
        } catch (SQLException ex) {
            System.out.println("Erro na conexao com o Banco de Dados ");  
            
        }
        
        
    }
    
}
