package game;

public class pokemon {
    String name;
    int level;
    int hp;
    void evolve(){
        hp+=10;
        level+=1;
        System.out.println(name+"이(가)"+level+"로 레벨 업 합니다.");
    }
    void attack(){
        System.out.println("기본 공격을 시전합니다.");
    }
}
