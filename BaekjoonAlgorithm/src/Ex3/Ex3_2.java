package Ex3;
import java.util.Scanner;
public class Ex3_2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=num; i>0; i--)
            System.out.println(i);
        scan.close();
    }
}