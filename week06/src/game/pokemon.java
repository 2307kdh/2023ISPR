package game;

public class pokemon {
    private String name;
    private String hg;
    private int level;

    private static int count=0;
    public pokemon(String name) {
        this(name,1,50);
        System.out.println("포켓몬 객체 생성(매개변수 1개로, 레벨은 1, 체력은 50으로 자동 설정)");
        //this.name = name;
    }

    public pokemon() {
        this("이상해씨",1,50);
        System.out.println("포켓몬 객체 생성, 기본생성자");
    }

    public pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        count++;
    }
//getter setter

    public static int getCount() {
        return count;
    }

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
    void attack(pokemon pokemon){
        System.out.println(this.name+"이(가)"+pokemon.name+"에게 기본 공격을 시전합니다.");
    }
    void attack(){
        System.out.println(this.name+"가 광역 공격을 시전합니다.");
    }
}
