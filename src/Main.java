public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
            new Gryffindor("Harry Potter", 0, 1,2,3,4),
            new Gryffindor("Germiona Greindger", 5, 6,7,8,9),
            new Gryffindor("Ron Yisli", 10, 11,12,13,14)
        };
        Hufflepuff[] hufflepuffs = {
            new Hufflepuff("Zaharia Smit", 15, 16,17,18,19),
            new Hufflepuff("Sedrik Driggori", 20, 21,22,23,24),
            new Hufflepuff("Dzastin Finch-Fletchli", 25, 26,27,28,29)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 30, 31,32,33,34),
                new Ravenclaw("Падма Патил", 35, 36,37,38,39),
                new Ravenclaw("Маркус Белби", 40, 41,42,43,44)
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 45, 46,47,48,49),
                new Slytherin("Грэхэм Монтегю", 50, 51,52,53,54),
                new Slytherin("Грегори Гойл", 55, 56,57,58,59)
        };

        System.out.println(gryffindors[0].toString());
        gryffindors[2].compareGryf(gryffindors[1]);

    }
}