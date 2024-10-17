interface Animal {
    void sound();
}

class Lion implements Animal {
    public void sound() {
        System.out.println("Lion roars");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Animal myLion = new Lion();
        myLion.sound();
    }
}
