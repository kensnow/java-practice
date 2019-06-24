package com.company;

public class Main {

    public static void main(String[] args) {
	// char
        //can only store 1 charachter, use single quotes
        //width of 16 (2 bytes)
        //can be unicode chars

        char myChar = 'b';

        //use \u and single quotes along with code
        char specialUnicodeChar = '\u00A9';

        char registeredUnicodeSymbol = '\u00AE';

        System.out.println("copyrite symbol " +  specialUnicodeChar);
        System.out.println("registered symbol " + registeredUnicodeSymbol);

        boolean myBool = true;
        System.out.println("bool: " + myBool);
    }
}
