package Ex1_2;
import java.util.Scanner;
public class Ex3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        System.out.println(a-b);
    }
}