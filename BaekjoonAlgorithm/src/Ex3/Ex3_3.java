package Ex3;
import java.util.Scanner;
public class Ex3_3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1; i<10 ; i++)
            System.out.println(num+" * "+i+" = "+num*i);
        scan.close();
    }
}