package game;

public class Charizard extends Pokemon{
    public Charizard(){this.setHp(78);
        this.setLevel(36);
        this.setName("Charizard");}
    public Charizard(int level, int hp){
        super();
        this.setHp(hp);
        this.setLevel(level);
        this.setName("Charizard");
    }
    @Override
    public void attack() {
        super.attack();
        System.out.println(this.name+"가 광역 물대포 공격을 합니다");}
}
