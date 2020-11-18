package codigo;

/**
 *
 * @author Suelany
 */
public enum TokenType {

    OPERATOR, 
    DELIMITER, 
    KEYWORD, 
    KEYWORD2, 
    IDENTIFIER, 
    NUMBER,     
    STRING,     
    STRING2,    
    COMMENT,    
    COMMENT2,   
    WARNING,    
    ERROR;      

    
    public static boolean isComment(Token t) {
        if (t != null && (t.type == COMMENT || t.type == COMMENT2)) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isKeyword(Token t) {
        if (t != null && (t.type == KEYWORD || t.type == KEYWORD2)) {
            return true;
        } else {
            return false;
        }
    }


 
    public static boolean isString(Token t) {
        if (t != null && (t.type == STRING || t.type == STRING2)) {
            return true;
        } else {
            return false;
        }
    }
}
