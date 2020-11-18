package codigo;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Segment;
/**
 *
 * @author SuelaNY
 */
public abstract class DefaultJFlexLexer{
    protected int tokenStart;
    protected int tokenLength;
    protected int offset;

    protected Token token(TokenType type, int tStart, int tLength,
            int newStart, int newLength) {
        tokenStart = newStart;
        tokenLength = newLength;
        return new Token(type, tStart + offset, tLength);
    }

    protected Token token(TokenType type, int start, int length) {
        return new Token(type, start + offset, length);
    }

    protected Token token(TokenType type) {
        return new Token(type, yychar() + offset, yylength());
    }

    protected Token token(TokenType type, int pairValue) {
        return new Token(type, yychar() + offset, yylength(), (byte) pairValue);
    }

    public void parse(Segment segment, int ofst, List<Token> tokens) {
        try {
            CharArrayReader reader = new CharArrayReader(segment.array, segment.offset, segment.count);
            yyreset(reader);
            this.offset = ofst;
            for (Token t = yylex(); t != null; t = yylex()) {
                tokens.add(t);
            }
        } catch (IOException ex) {
            Logger.getLogger(DefaultJFlexLexer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    public abstract void yyreset(Reader reader);

  
    public abstract Token yylex() throws java.io.IOException;


    public abstract char yycharat(int pos);

    
    public abstract int yylength();

   
    public abstract String yytext();

    
    public abstract int yychar();
}
