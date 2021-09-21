
public class Naruto extends Ninja{
    public Naruto() {
        super(new Gamakichi(), new rikudosenninmodo(), new rasengan());
    }


    @Override
    public void throwingkunai() {
        System.out.println("I'm throwing kunai!");
    }
}
