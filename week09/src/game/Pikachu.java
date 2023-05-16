package game;

public class Pikachu extends Pokemon{
    public Pikachu(){
        this.setHp(35);
        this.setLevel(1);
        this.setName("Pikachu");}
    public Pikachu(int level, int hp){
        super();
        this.setHp(hp);
        this.setLevel(level);
        this.setName("Pikachu");
    }
    @Override
    public void attack() {
        System.out.println(this.getName()+"가 광역 백만볼트 공격을 시전합니다.");}
}
