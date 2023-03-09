public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int faith;
    private int honesty;

    public Hufflepuff(String name, int witchcraft, int transgression, int diligence, int faith, int honesty) {
        super(witchcraft, transgression, name);
        this.diligence = diligence;
        this.faith = faith;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int sumCharacter() {
        return diligence + faith + honesty;
    }

    public void compareHuff(Hufflepuff hufflepuff) {
        int oneStudCompare = sumCharacter();
        int twoStudCompare = hufflepuff.sumCharacter();
        if (oneStudCompare>twoStudCompare) {
            System.out.println("Пуффендуй " + getName() + " лучше, чем " + hufflepuff.getName());
        }
        else {
            System.out.println("Пуффендуй " + hufflepuff.getName() + " лучше, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "diligence=" + diligence +
                ", faith=" + faith +
                ", honesty=" + honesty + super.toString() +
                '}';
    }
}
