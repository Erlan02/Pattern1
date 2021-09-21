
public class Main {

    public static void main(String[] args) {
        Ninja ninja = new Sasuke();
        ninja.throwingkunai();
        ninja.strongestJutsu();
        ninja.usespecialskills();
        ninja.usesummoning();
        System.out.println("-----------");

        ninja.setSpecialskills(new rikudosenninmodo());
        ninja.usespecialskills();

    }
}
