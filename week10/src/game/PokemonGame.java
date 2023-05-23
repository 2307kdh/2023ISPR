package game;
public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pokemon = new Pikachu(1,35);
        Pikachu pikachu = new Pikachu(14,165);
        pikachu.setHp(99); //can not access protected variable(different package and it is not a child class)
        //System.out.println(pikachu.getHp());
        System.out.println(pikachu.getHp());
        pikachu.attack();//execute override method
        Pikachu pikachu1 = (Pikachu) pokemon;
        pikachu1.ElectricInfo();
    }
}
