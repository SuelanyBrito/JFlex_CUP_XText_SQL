package codigo;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Segment;

/**
 *
 * @author Suelany
 */
public class Token implements Serializable, Comparable {

    public final TokenType type;
    public final int start;
    public final int length;
    
    public final byte pairValue;
    public final short kind = 0;

   
    public Token(TokenType type, int start, int length) {
        this.type = type;
        this.start = start;
        this.length = length;
        this.pairValue = 0;
    }

   
    public Token(TokenType type, int start, int length, byte pairValue) {
        this.type = type;
        this.start = start;
        this.length = length;
        this.pairValue = pairValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Token) {
            Token token = (Token) obj;
            return ((this.start == token.start) &&
                    (this.length == token.length) &&
                    (this.type.equals(token.type)));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return start;
    }

    @Override
    public String toString() {
        if (pairValue == 0) {
            return String.format("%s (%d, %d)", type, start, length);
        } else {
            return String.format("%s (%d, %d) (%d)", type, start, length, pairValue);
        }
    }

    @Override
    public int compareTo(Object o) {
        Token t = (Token) o;
        if (this.start != t.start) {
            return (this.start - t.start);
        } else if (this.length != t.length) {
            return (this.length - t.length);
        } else {
            return this.type.compareTo(t.type);
        }
    }

    /**
     * return the end position of the token.
     * @return start + length
     */
    public int end() {
        return start + length;
    }

    /**
     * Get the text of the token from this document
     */
    public CharSequence getText(Document doc) {
        Segment text = new Segment();
        try {
            doc.getText(start, length, text);
        } catch (BadLocationException ex) {
            Logger.getLogger(Token.class.getName()).log(Level.SEVERE, null, ex);
        }
	return text;
    }

    public String getString(Document doc) {
        try {
            return doc.getText(start, length);
        } catch (BadLocationException ex) {
            Logger.getLogger(Token.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
}
    