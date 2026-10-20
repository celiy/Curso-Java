package ReturnTypes;

import java.util.*;

// Exemplos de métodos com cada tipo de retorno.
public class ReturnTypes {

    public static void main(String[] args) {
        imprimirMensagem("Olá, mundo!");
        System.out.println(retornaByte());
        System.out.println(retornaShort());
        System.out.println(retornaInt());
        System.out.println(retornaLong());
        System.out.println(retornaFloat());
        System.out.println(retornaDouble());
        System.out.println(retornaChar());
        System.out.println(retornaBoolean());
        System.out.println(retornaString());
        System.out.println(Arrays.toString(retornaArrayInt()));
        System.out.println(Arrays.toString(retornaArrayString()));
        System.out.println(retornaPessoa().nome);
        retornaRunnable().run();
        System.out.println(retornaStatus());
        System.out.println(retornaLista());
        System.out.println(retornaSet());
        System.out.println(retornaMapa());
        System.out.println(buscarNome(1).orElse("não encontrado"));
        System.out.println(buscarNome(2).orElse("não encontrado"));
        System.out.println(primeiroItem(retornaLista()));
        System.out.println(retornaPonto());
        System.out.println(retornaNull());
        System.out.println(retornaVarios()[1].nome);
    }

    // 1. void: não retorna valor
    static void imprimirMensagem(String msg) {
        System.out.println(msg);
    }

    // 2. Tipos primitivos inteiros
    static byte retornaByte()   { return 127; }
    static short retornaShort() { return 32000; }
    static int retornaInt()     { return 42; }
    static long retornaLong()   { return 9_000_000_000L; }

    // 3. Tipos primitivos decimais
    static float retornaFloat()   { return 3.14f; }
    static double retornaDouble() { return 2.718281828; }

    // 4. char e boolean
    static char retornaChar()       { return 'A'; }
    static boolean retornaBoolean() { return 10 > 5; }

    // 5. String (tipo de referência)
    static String retornaString() { return "Olá, mundo!"; }

    // 6. Array (primitivo e de objetos)
    static int[] retornaArrayInt() { return new int[]{1, 2, 3}; }
    static String[] retornaArrayString() { return new String[]{"a", "b"}; }

    // 7. Objeto de uma classe própria
    static Pessoa retornaPessoa() { return new Pessoa("Ana", 30); }

    // 8. Interface como retorno
    static Runnable retornaRunnable() {
        return () -> System.out.println("executando!");
    }

    // 9. Enum
    enum Status { ATIVO, INATIVO }
    static Status retornaStatus() { return Status.ATIVO; }

    // 10. Collections (List, Set, Map)
    static List<String> retornaLista() { return List.of("x", "y", "z"); }
    static Set<Integer> retornaSet()   { return Set.of(1, 2, 3); }
    static Map<String, Integer> retornaMapa() {
        return Map.of("idade", 30, "altura", 175);
    }

    // 11. Optional: valor que pode não existir
    static Optional<String> buscarNome(int id) {
        return id == 1 ? Optional.of("Ana") : Optional.empty();
    }

    // 12. Tipo genérico
    static <T> T primeiroItem(List<T> lista) {
        return lista.get(0);
    }

    // 13. Record (Java 16+): retorno de dados imutáveis
    record Ponto(int x, int y) {}
    static Ponto retornaPonto() { return new Ponto(3, 4); }

    // 14. Retorno de null (tipo de referência pode ser null, primitivo não)
    static String retornaNull() { return null; }

    // 15. Retorno de múltiplos valores via objeto (Java não tem tupla nativa)
    static Pessoa[] retornaVarios() {
        return new Pessoa[]{ new Pessoa("Bia", 25), new Pessoa("Caio", 40) };
    }
}
