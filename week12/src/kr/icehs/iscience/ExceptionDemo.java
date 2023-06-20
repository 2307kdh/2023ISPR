package kr.icehs.iscience;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();
            System.out.println(numerator / denominator);
        }catch (InputMismatchException e){
            System.out.println("Input data must be integer!!!");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Error Occured.");
            System.out.println(e.getMessage());
        }
    }
}
