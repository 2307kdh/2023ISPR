import java.util.Scanner;
public class TemperatureConverterDemo {
    public static void main(String[] args) {
        double f=0.0,c=0.0,k=0.0;
        char sans = '\uAC00';
        System.out.println(sans);
        Scanner scanner = new Scanner(System.in);
        // 1) 화씨에서 섭씨로 2) 섭씨에서 화씨로 3) 종료
        while(true){
            System.out.print("-1)Celcius to Fahrenheit -2)Fahrenheit to Celcius -3)Celcius to Kelvin -4)Exit : ");
            String menu = scanner.nextLine();
            if(menu.equals("4")){
            System.out.println("탈주시도");
            break;}
            switch(menu) {

                case "1":
                    System.out.print("Enter temperature in Celcius: ");
                    c = scanner.nextDouble();
                    f = (c * 9.0 / 5.0) + 32.0;
                    System.out.println(c + "°C is " + f + "°F");
                    break;
                case "2":
                    System.out.print("Enter temperature in Fahrenheit: ");
                    f = scanner.nextDouble();
                    c = (f - 32.0) * (5.0 / 9.0);
                    System.out.println(f + "°F is " + c + "°C");
                    break;
                case "3":
                    System.out.print("Enter temperature in Fahrenheit: ");
                    c = scanner.nextDouble();
                    k = c + 273.15;
                    System.out.println(c + "°C is " + k + "K");
                    break;

                default:
                    System.out.println("plz check your finger. Choose from 1, 2, 3");
                    break;

            }
        }
    }
}
