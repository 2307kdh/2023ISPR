package kr.icehs.iscience;
final class CannotInheritance{}
class SuperFinalDemo{
    void test(){
        System.out.println("test1 method");
    }
    final void test2(){
        System.out.println("test2 method");
    }
}
// cannto public class Finaldemo extends CannotInheritance{}
public class FinalDemo extends SuperFinalDemo{
    public static final String MINCHANG = "아 저 노트북 학업 목적으로 성실하게 썼다니까요";//constant

    @Override
    void test() {
        super.test();
    }

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(MINCHANG);

    }

}
