package main;
import java.util.Scanner;
public class GameDemo {
    public static void main(String[] args) {
        Character player = Character.Dao;
        japanroute wichi = japanroute.Iriomote;
        if(wichi == japanroute.Iriomote)
            System.out.print("이리오모테에 간 ");
        if(player == Character.Dao){
            System.out.println("섭종당한 킹오");
        } else if (player == Character.Dizini){
            System.out.println("섭종당한 디지니");
        } else if (player == Character.Marid){
            System.out.println("ㅈ오지만 좋은 마리드");
        } else if (player == Character.Rodumani){
            System.out.println("돈 없는 아저씨 로두마니");
        } else if (player == Character.Uni){
            System.out.println("누군가의 동생 우니");
        }
        }


    }