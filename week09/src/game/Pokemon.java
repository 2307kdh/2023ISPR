package game;

public class Pokemon {
    protected int level;
    protected int hp;
    protected String name;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void attack(){
        System.out.println(this.name+"이(가) 광역 공격을 시전합니다.");
    }

}
