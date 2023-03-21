import java.util.Scanner;
public class TemperatureConverterDemo {
    public static void main(String[] args) {
        double f=0.0,c=0.0;
        Scanner scanner = new Scanner(System.in);
        // 1) 화씨에서 섭씨로 2) 섭씨에서 화씨로 3) 종료
        while(true){
            System.out.print("-1)Celcius to Fahrenheit -2)Fahrenheit to Celcius -3)Exit : ");
            int menu = scanner.nextInt();
            if(menu==1){
                System.out.print("Enter temperature in Celcius: ");
                c=scanner.nextDouble();
                f=(c*9.0/5.0)+32.0;
                System.out.println(c+"°C is "+f+"°F");
            }
            else if(menu==2){
                System.out.print("Enter temperature in Fahrenheit: ");
                f = scanner.nextDouble();
                c= (f-32.0)*(5.0/9.0);
                System.out.println(f+"°F is "+c+"°C");
            }
            else if(menu==3) {
                System.out.println("탈주시도");
                break;
            }
            else if(menu==6974){
                System.out.println("거유지혜");
                break;
            }
            else{
                System.out.println("plz check your finger. Choose from 1, 2, 3");
            }
        }
    }
}
