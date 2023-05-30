package game;

import javax.swing.plaf.SpinnerUI;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon charizard = new Charizard(36,80); //upcast
        Pokemon pikachu = new Pikachu(14, 165); //upcast
        JetPack ISHSjetPack = new JetPack();
        pikachu.setFlyable(ISHSjetPack);
        pikachu.performFly();
        charizard.setFlyable(new Wings());
        charizard.performFly();
    }
}
