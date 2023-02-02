package Animal;

public class Hippo extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Hiiiiiiiiiipoo");
    }

    @Override
    public void move() {
        System.out.println("under water");
    }

    @Override
    public void eat() {
        System.out.println("humans");
    }
}
