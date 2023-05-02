package game;

public class pokemongame {
    public static void main(String[] args) {
        System.out.println(pokemon.getCount());
        pokemon squirtle = new pokemon("꼬부기");
        pokemon pikachu = new pokemon("피카츄",5,100);
        pokemon charizard = new pokemon("리자몽",36,800);
        pokemon bulbasaur = new pokemon();
        System.out.println(pokemon.getCount());
        System.out.println(squirtle);
        System.out.println(pikachu);
        System.out.println(charizard);
        System.out.println(bulbasaur);
//        pikachu.setName("피카츄");
//        charizard.setName("리자몽");
        System.out.println(pikachu.getName());
//        pikachu.name = "피카츄";
//        charizard.name = "리자몽";
//        pikachu.level = 5;
//        charizard.level = 36;
//        pikachu.setLevel(5);
//        charizard.setLevel(36);
        pikachu.evolve();
        charizard.evolve();
        bulbasaur.attack();
        pikachu.attack(charizard);
        charizard.attack(pikachu);

    }
}
