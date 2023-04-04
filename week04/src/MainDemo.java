import java.util.Scanner;
public class MainDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input ssn number(13 digits) : ");
        String socialSecurityNumber = scanner.nextLine();

        char gender = socialSecurityNumber.charAt(6);

        String genderstring = switch (gender) {
            case '1', '3' -> "Male";
            case '2', '4' -> "Female";
            default -> "plz check your finger. This isn't Korean social security number";
        };
        System.out.println(genderstring);
    }
}
