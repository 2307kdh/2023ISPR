package game;

public class pokemongame {
    public static void main(String[] args) {
        pokemon pikachu = new pokemon();
        pokemon charizard = new pokemon();
        pikachu.name = "피카츄";
        charizard.name = "리자몽";
        pikachu.level = 5;
        charizard.level = 36;
        pikachu.evolve();
        pikachu.attack();
    }
}
