
public abstract class Ninja {
    private Summoning summoning;
    private Specialskills specialskills;
    private Jutsu jutsu;

    public Ninja(Summoning summoning, Specialskills specialskills, Jutsu jutsu) {
        this.summoning = summoning;
        this.specialskills = specialskills;
        this.jutsu = jutsu;
    }

    public void strongestJutsu(){
        jutsu.strongestJutsu();
    }

    public void usespecialskills(){
        specialskills.specialskills();
    }

    public void usesummoning(){
        summoning.summoning();
    }

    public abstract void throwingkunai();

    public void setSummoning(Summoning summoning) {
        this.summoning = summoning;
    }

    public void setSpecialskills(Specialskills specialskills) {
        this.specialskills = specialskills;
    }

    public void setJutsu(Jutsu jutsu) {
        this.jutsu = jutsu;
    }
}

