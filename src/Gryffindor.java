
public class Gryffindor extends Hogwarts {
    private int nibility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int witchcraft, int transgression, int nibility, int honor, int bravery) {
        super(witchcraft, transgression, name);
        this.nibility = nibility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNibility() {
        return nibility;
    }

    public void setNibility(int nibility) {
        this.nibility = nibility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    private int sumCharacter() {
        return nibility + honor + bravery;
    }

    public void compareGryf(Gryffindor gryffindors) {
        int oneStudCompare = sumCharacter();
        int twoStudCompare = gryffindors.sumCharacter();
        if (oneStudCompare>twoStudCompare) {
            System.out.println("Гриффиндор " + getName() + " лучше, чем " + gryffindors.getName());
        }
        else {
            System.out.println("Гриффиндор " + gryffindors.getName() + " лучше, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nibility=" + nibility +
                ", honor=" + honor +
                ", bravery=" + bravery + super.toString() +
                '}';
    }
}
