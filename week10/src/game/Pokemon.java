package game;

public abstract class Pokemon {
    protected int level;
    protected int hp;
    protected String name;
    flyBehavior flyable;
    public void setFlyable(flyBehavior flyable) {
        this.flyable = flyable;
    }
    public void performFly(){
        System.out.println(this.name+" ");
        this.flyable.fly();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void attack();
    public void attack(Pokemon target){
        if(target instanceof Pikachu){
            System.out.println("pika pika~");
        }
        System.out.println(this.name+"does a attack to "+target.name);
    }

}
