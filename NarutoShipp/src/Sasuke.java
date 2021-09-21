
public class Sasuke extends Ninja{
    public Sasuke () {
        super(new Aoda(), new sharingan(), new chidori());
    }

    @Override
    public void throwingkunai() {
        System.out.println("I'm throwing kunai!");
    }
}
