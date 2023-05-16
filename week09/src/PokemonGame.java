import game.Charizard;
import game.Pikachu;
import game.Squirtle;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        System.out.println(charizard.getName());
        Pikachu pikachu = new Pikachu(14,165);
        pikachu.setHp(99); //can not access protected variable(different package
        //System.out.println(pikachu.getHp());
        System.out.println(pikachu.getHp());
        Squirtle squirtle = new Squirtle();
        squirtle.attack();//execute override method
        pikachu.attack();//execute override method
        charizard.attack();//execute super class method and override method
        System.out.println(squirtle.getHp());
    }
}
