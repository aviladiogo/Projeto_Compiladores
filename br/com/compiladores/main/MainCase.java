package br.com.compiladores.main;

import br.com.compiladores.exceptions.IsiLexicalException;
import br.com.compiladores.lexico.IsiScanner;
import br.com.compiladores.lexico.Token;

public class MainCase {
    public static void main(String[] args) {
        try {
            IsiScanner sc = new IsiScanner("input.isi");
            Token token = null;
            do {
                token = sc.nextToken();
                if (token != null) {
                    System.out.println(token);
                }
            } while (token != null);
            
        } catch (IsiLexicalException ex) {
            System.out.println("Lexical ERROR " + ex.getMessage());

        }
    }
}