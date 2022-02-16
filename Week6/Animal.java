package Week6;

// Task 4
public class Animal {
    String name;
    Animal(String nameIn) {
        name = nameIn;
    }

    public String greeting() {
        return "Hello, my name is " + name;
    }
}