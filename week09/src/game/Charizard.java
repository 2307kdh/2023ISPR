package game;

public class Charizard extends Pokemon{
    public Charizard(){
        this.setHp(44);
        this.setLevel(1);
        this.setName("Chrizard");}
    public Charizard(int level, int hp){
        super();
        this.setHp(hp);
        this.setLevel(level);
        this.setName("Charizard");
    }
    @Override
    public void attack() {
        super.attack();
        System.out.println(this.getName()+"가 광역 물대포 공격을 합니다");}
}
