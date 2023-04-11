package game;

public class pokemon {
    private String name;
    private String hg;
    private int level;

    public String getHg() {
        return hg;
    }

    public void setHg(String hg) {
        this.hg = hg;
    }

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

    private int hp;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void evolve(){
        hp+=10;
        level+=1;
        System.out.println(name+"이(가)"+level+"로 레벨 업 합니다.");
    }
    void attack(){
        System.out.println("기본 공격을 시전합니다.");
    }
}
