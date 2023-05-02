package kr.icehs.iscience;
class Singleton{
    private static Singleton s = new Singleton(); // unique object
    private Singleton() {
        System.out.println("Only One Object is Created!");
    }

    public static Singleton getInstance() {
        return s;
    }

    @Override
    public String toString() {
        return "Singleton pattern object";
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().toString());
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1==s2)
            System.out.println("same Object");
        else
            System.out.println("Different Object");
    }
}
