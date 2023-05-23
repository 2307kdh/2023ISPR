package game;

import javax.swing.plaf.SpinnerUI;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard(36,80);
        Pikachu pikachu = new Pikachu(14, 165);
        JetPack ISHSjetPack = new JetPack();
        pikachu.setFlyable(ISHSjetPack);
        pikachu.performFly();
        charizard.setFlyable(new Wings());
        charizard.performFly();
    }
}
