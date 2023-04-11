package game;

public class pokemongame {
    public static void main(String[] args) {
        pokemon pikachu = new pokemon();
        pokemon charizard = new pokemon();
        pikachu.setName("피카츄");
        charizard.setName("리자몽");
        System.out.println(pikachu.getName());
//        pikachu.name = "피카츄";
//        charizard.name = "리자몽";
//        pikachu.level = 5;
//        charizard.level = 36;
        pikachu.setLevel(5);
        charizard.setLevel(36);
        pikachu.evolve();
        charizard.evolve();
        pikachu.attack();
        charizard.attack();

    }
}
