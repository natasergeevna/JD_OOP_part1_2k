public class Hogwarts {
    private int witchcraft;
    private int transgression;
    private String name;

    public Hogwarts(int witchcraft, int transgression, String name) {
        this.witchcraft = witchcraft;
        this.transgression = transgression;
        this.name = name;

    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int sumCharacter() {
        return transgression + witchcraft;
    }

    public void compareHogw(Hogwarts hogwarts) {
        int oneStudCompare = sumCharacter();
        int twoStudCompare = hogwarts.sumCharacter();
        if (oneStudCompare>twoStudCompare) {
            System.out.println("Студент " + getName() + " лучше, чем " + hogwarts.getName());
        }
        else {
            System.out.println("Студент " + hogwarts.getName() + " лучше, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                ", name='" + name + '\'' +
                '}';
    }
}
