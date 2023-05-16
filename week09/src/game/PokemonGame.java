package game;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        System.out.println(charizard.name);
        Pikachu pikachu = new Pikachu(14,165);
        pikachu.hp = 99; //PokemonGame class don't inherit from Pokemon class but it is in the same package(game), so the protected variables are accessible.
        //System.out.println(pikachu.getHp());
        System.out.println(pikachu.hp);
        Squirtle squirtle = new Squirtle();
        squirtle.attack();//execute override method
        pikachu.attack();//execute override method
        charizard.attack();//execute super class method and override method
        System.out.println(squirtle.getHp());
    }
}
