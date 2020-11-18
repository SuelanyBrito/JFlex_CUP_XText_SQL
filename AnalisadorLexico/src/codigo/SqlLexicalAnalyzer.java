package codigo;

import java.io.FileReader;
import java.io.IOException;
import java_cup.runtime.Symbol;
/**
 *
 * @author Suelany
 */
public class SqlLexicalAnalyzer {
    public static void main(String[] args) throws IOException {

        String caminho = "C:/Users/Suela/Documents/NetBeansProjects/AnalisadorLexico/src/codigo/program.sql";

        
        SqlLexer lexical = new SqlLexer(new FileReader(caminho));
        
        System.out.println("teste");

        Symbol sym;

        while ((sym= lexical.next_token()) != null) {           
            System.out.println("Token" + lexical.current_lexeme());
        }
    }
}
