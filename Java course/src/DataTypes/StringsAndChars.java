package DataTypes;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringsAndChars {
    public static void main(String[] args) {
        // Variables
        String myJob = "Programmer";
        String myName;
        myName = "Celi";

        // Constants
        final String COMPANY_NAME = "FN";
        final String LOCALTION;
        LOCALTION = "Europe";

        // Types
        String varString = "ABC";
        char varChar = 'a';

        // Unicode
        char letterA1 = 65; // 'A'
        char letterA2 = '\u0041'; // 'A'

        int letterANumber1 = 'A'; // 65
        int letterANumber2 = '\u0041'; // 65

        // Referencing
        // name1 and name2 will reference the same value on
        // the memory, while name3 will have the same value
        // but on a different memory address
        String name1 = "Celi";
        String name2 = "Celi";
        String name3 = new String("Celi");
    }

    public void stringMethods() {
        String varString = "The quick brown fox jumps over the lazy dog";

        // Length and basic info
        System.out.println(varString.length());    // 43
        System.out.println(varString.isEmpty());   // false
        System.out.println(varString.isBlank());   // false

        char[] letters = varString.toCharArray();
        System.out.println(letters[4]);            // q

        char[] part = new char[3];
        varString.getChars(4, 7, part, 0);
        System.out.println(part);                                   // qui

        // Comparison
        System.out.println(varString.equals("The quick brown fox jumps over the lazy dog"));                       // true
        System.out.println(varString.equalsIgnoreCase("the QUICK brown fox jumps over the lazy DOG")); // true
        System.out.println(varString.contentEquals(new StringBuilder("The quick")));                               // false
        System.out.println(varString.compareTo("The"));                                                            // 40
        System.out.println(varString.compareToIgnoreCase("the"));                                              // 40

        // Starts, ends, contains, regex
        System.out.println(varString.startsWith("The"));          // true
        System.out.println(varString.endsWith("dog"));            // true
        System.out.println(varString.contains("fox"));            // true
        System.out.println(varString.matches(".*fox.*"));   // true

        // Searching
        System.out.println(varString.indexOf('o'));     // 12
        System.out.println(varString.indexOf("fox"));   // 16

        System.out.println(varString.lastIndexOf('o'));     // 41
        System.out.println(varString.lastIndexOf("the"));   // 31

        // Substrings
        System.out.println(varString.substring(4));   // quick brown fox jumps over the lazy dog
        System.out.println(varString.substring(4, 9));          // quick

        // Modifying (each returns a new String, varString does not change)
        System.out.println(varString.concat(" !"));                             // The quick brown fox jumps over the lazy dog !
        System.out.println(varString.replace('o', '0'));            // The quick br0wn f0x jumps 0ver the lazy d0g
        System.out.println(varString.replace("the", "a"));         // The quick brown fox jumps over a lazy dog
        System.out.println(varString.replaceFirst("o", "0"));      // The quick br0wn fox jumps over the lazy dog
        System.out.println(varString.replaceAll("[aeiou]", "*"));  // Th* q**ck br*wn f*x j*mps *v*r th* l*zy d*g

        // Casing
        System.out.println(varString.toUpperCase());               // THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
        System.out.println(varString.toLowerCase());               // the quick brown fox jumps over the lazy dog

        // Splitting and joining
        String[] words = varString.split(" ");
        System.out.println(words.length);               // 9

        String[] parts = varString.split(" ", 3);
        System.out.println(parts[2]);                                            // brown fox jumps over the lazy dog
        System.out.println(String.join("-", "a", "b", "c"));   // a-b-c

        // Whitespace
        String spaced = "   Java   ";
        System.out.println("[" + spaced.trim() + "]");          // [Java]
        System.out.println("[" + spaced.strip() + "]");         // [Java]
        System.out.println("[" + spaced.stripLeading() + "]");  // [Java   ]
        System.out.println("[" + spaced.stripTrailing() + "]"); // [   Java]
        System.out.println("   ".isBlank());                    // true

        // Multi-line text
        String text = "Linha 1\nLinha 2";
        text.lines().forEach(System.out::println);        // Linha 1 / Linha 2
        System.out.println(text.indent(2));            // each line indented by 2 spaces
        System.out.println("  a\n  b".stripIndent());     // a / b
        System.out.println("a\\tb".translateEscapes());   // a<TAB>b

        // Repeat, format, valueOf
        System.out.println("Java".repeat(3));                                  // JavaJavaJava
        System.out.println("Frase com %d caracteres".formatted(varString.length())); // Frase com 43 caracteres
        System.out.println(String.format("%.2f", 3.14159));                          // 3.14
        System.out.println(String.valueOf(letters, 4, 5));               // quick
    }
}
