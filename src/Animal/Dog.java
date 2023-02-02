package Animal;

public class Dog extends Canine implements Pet {
    @Override
    public void makeNoise() {
        System.out.println("wooof");
    }

    @Override
    public void eat() {
        System.out.println("eat bones");
    }

    @Override
    public void beNice() {
        System.out.println("I'm a nice dog who is loyal to his owner");
    }
}
