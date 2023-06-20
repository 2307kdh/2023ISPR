package game;

public abstract class Pokemon extends Nippon{
    protected int level;
    protected int hp;
    protected String name;
    FlyBehavior flyable;
    public void setFlyable(FlyBehavior flyable) {
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
    public void attack(Nippon target)throws Exception{
        if(target instanceof Digimon){
            throw new Exception("ポケットモンじゃない～～");
        }else if(target instanceof Pokemon){if(this instanceof Pikachu){
            System.out.println("pika pika~");
        }}
        Pokemon targetpokemon = (Pokemon)target;

        System.out.println(this.name+"does a attack to "+targetpokemon.name);
    }

    @Override
    public String toString() {
        return this.getName()+"[HashCode: "+Integer.toHexString(hashCode())+"]";
    }
}
