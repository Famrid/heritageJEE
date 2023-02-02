package Animal;

public class Wolf extends Canine{
    @Override
    public void makeNoise() {
        System.out.println("Grrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("eat sheep");
    }
}
