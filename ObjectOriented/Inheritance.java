class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.sound();
    }
}
