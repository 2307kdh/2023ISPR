package game;

import javax.swing.plaf.SpinnerUI;

public class PokemonGame {
    public static void main(String[] args) {
        Digimon d1 = new Agumon();
        Pokemon charizard = new Charizard(36, 80); //upcast
        Pokemon pikachu = new Pikachu(14, 165); //upcast
        JetPack ISHSjetPack = new JetPack();
        pikachu.setFlyable(ISHSjetPack);
        pikachu.performFly();
        charizard.setFlyable(new Wings(){
            @Override
            public void fly() {
                System.out.println("Fly with Special Wings");
            }
        });
        charizard.performFly();
        Pikachu pikachu2 = (Pikachu) pikachu;
        pikachu2.ElectricInfo();
        pikachu2.setFlyable(new Balloon());
        pikachu2.performFly();
        System.out.println(pikachu2.equals(pikachu));
        try{
        pikachu.attack(d1);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //below methoddsd can't use with parent's variable
//        pikachu.electricInfo();
//        charizard.fireInfo();
    }
}
