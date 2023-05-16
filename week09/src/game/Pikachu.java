package game;

public class Pikachu extends Pokemon{
    public Pikachu(){
        this.setHp(35);
        this.setLevel(1);
        this.setName("Pikachu");}
    public Pikachu(int level, int hp){
        super();
        this.hp = 35; // without setter, protected access
        this.level = level;
        this.name = "Pikachu";
    }
    @Override
    public void attack() {
        System.out.println(this.name+"가 광역 백만볼트 공격을 시전합니다.");}
}
