package PrivatePublicStatic;

public class KeywordsObject {
    public static void main(String[] args) {
        // WORKS: public static method
        KeywordsClass.sayHi();

        // DOES NOT WORK: private method is not visible outside MethodKeywords.KeywordsHerstal
        // MethodKeywords.KeywordsHerstal.sayHiPrivate();

        // WORKS: instance method called through an object
        KeywordsClass herstal = new KeywordsClass();
        herstal.sayHiInstance();
    }
}
