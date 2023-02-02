package Animal;

public class Cat extends Feline implements Pet {
    @Override
    public void makeNoise() {
        System.out.println("miaou");
    }

    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    @Override
    public void beNice() {
        System.out.println("I'm a nice cat who dominate his owner");
    }
}
