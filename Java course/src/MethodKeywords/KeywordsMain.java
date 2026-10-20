package MethodKeywords;

public class KeywordsMain {
    public static void main(String[] args) {
        // WORKS: public static method
        KeywordsHerstal.sayHi();

        // DOES NOT WORK: private method is not visible outside MethodKeywords.KeywordsHerstal
        // MethodKeywords.KeywordsHerstal.sayHiPrivate();

        // WORKS: instance method called through an object
        KeywordsHerstal herstal = new KeywordsHerstal();
        herstal.sayHiInstance();
    }
}
