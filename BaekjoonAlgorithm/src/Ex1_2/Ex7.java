package Ex1_2;
import java.util.Scanner;
public class Ex7{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in);){
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }
    }
}