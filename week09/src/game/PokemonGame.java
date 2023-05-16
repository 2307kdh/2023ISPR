package game;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        System.out.println(charizard.getName());
        Pikachu pikachu = new Pikachu(1,35);
        System.out.println(pikachu.getHp());
        Squirtle squirtle = new Squirtle();
        squirtle.attack();//execute override method
        pikachu.attack();//execute override method
        charizard.attack();//execute super class method and override method
        System.out.println(squirtle.getHp());
    }
}
