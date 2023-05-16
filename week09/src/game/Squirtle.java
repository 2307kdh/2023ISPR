package game;

public class Squirtle extends Pokemon{
    public Squirtle(){
        this.setHp(35);
        this.setLevel(1);
        this.setName("꼬부기");}
    public Squirtle(int level, int hp){
        super();
        this.setHp(hp);
        this.setLevel(level);
        this.setName("꼬부기");
    }

    @Override
    void attack() {
        System.out.println(this.getName()+"가 광역 물대포 공격을 합니다");
    }
}
