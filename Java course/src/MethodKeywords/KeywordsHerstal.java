package MethodKeywords;

public class KeywordsHerstal {
    public static void main(String[] args) {
        // WORKS: private members are accessible inside their own class
        sayHiPrivate();

        // DOES NOT WORK: sayHiInstance() is not static, it needs an object
        // sayHiInstance();

        // WORKS: create an object, then call the instance method
        new KeywordsHerstal().sayHiInstance();
    }

    // 'private': can only be accessed inside MethodKeywords.KeywordsHerstal
    private static void sayHiPrivate() {
        System.out.println("Hi from a private method!");
    }

    // 'public': can be used by anyone outside MethodKeywords.KeywordsHerstal
    public static void sayHi() {
        System.out.println("Hi from a public method!");
    }

    // No 'static': needs an object to be called
    public void sayHiInstance() {
        System.out.println("Hi from an instance method!");
    }
}
