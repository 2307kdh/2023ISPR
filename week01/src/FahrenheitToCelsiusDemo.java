import java.util.Scanner;

public class FahrenheitToCelsiusDemo {
    public static void main(String[] args){
        double f,c; //회색은 선언했지만 쓰이지 않은 변수를 뜻한다.
        Scanner sc = new Scanner(System.in);
        f = sc.nextDouble();
        c = (f-32)*5/9;
        System.out.println("화씨 "+f+"도는 섭씨 약 "+c+"도입니다.");
        //(화씨온도-32)5/9
        System.out.println();
    }
}
