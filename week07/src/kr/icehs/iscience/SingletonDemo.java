package kr.icehs.iscience;
class Singleton{
    private Singleton() {
        System.out.println("단 하나의 객체!");
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        //Singleton s = new Singleton();//private access때문

    }
}
