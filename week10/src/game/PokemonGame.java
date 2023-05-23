package game;

import javax.swing.plaf.SpinnerUI;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard(36,80);
        Pikachu pikachu = new Pikachu(14, 165);
        Wings wings = new Wings();
        JetPack jetPack = new JetPack();
        pikachu.setFlyable(jetPack);
        pikachu.performFly();
        charizard.setFlyable(wings);
        charizard.performFly();
    }
}
