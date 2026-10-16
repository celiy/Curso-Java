**private**: Can only be accessed inside of it's Class

**public**: Can be used by anyone outsite of it's Class

**static**: Can be called

# **private**

Herstal.java

```java
// is 'private'
private static void sayHi() {
    System.out.println("Hi from Herstal in a method!");
}
```

Main.java

```java
public class Main {
    public static void main(String[] args) {
    
        //DOES NOT WORK
        Herstal.sayHi();
        
    }
}
```

# **public**

Herstal.java

```java
// is 'public'
public static void sayHi() {
    System.out.println("Hi from Herstal in a method!");
}
```

Main.java

```java
public class Main {
    public static void main(String[] args) {
    
        //WORKS
        Herstal.sayHi();
        
    }
}
```

# **static**

Herstal.java

```java
public class Herstal {
    public static void main(String[] args) {
    
        // DOES NOT WORK
        sayHi();
        
    }

    // No 'static'
    public void sayHi() {
        System.out.println("Hi from Herstal in a method!");
    }
}
```