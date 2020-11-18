package codigo;

import java.io.File;

/**
 *
 * @author Suela
 */
public class Generator {
    public static void main(String[] args){
        String caminho = "C:/Users/Suela/Documents/NetBeansProjects/AnalisadorLexico/src/codigo/sql.flex";
        generateLexer(caminho);
    }
    
    public static void generateLexer(String caminho){
        File archive = new File(caminho);
        jflex.Main.generate(archive);
    }
}
