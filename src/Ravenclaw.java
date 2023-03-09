public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int witchcraft, int transgression, int mind, int wisdom, int wit) {
        super(witchcraft, transgression, name);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int sumCharacter() {
        return mind + wisdom + wit + creativity;
    }

    public void compareRave(Ravenclaw ravenclaw) {
        int oneStudCompare = sumCharacter();
        int twoStudCompare = ravenclaw.sumCharacter();
        if (oneStudCompare>twoStudCompare) {
            System.out.println("Когтевран " + getName() + " лучше, чем " + ravenclaw.getName());
        }
        else {
            System.out.println("Когтевран " + ravenclaw.getName() + " лучше, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity + super.toString() +
                '}';
    }
}
