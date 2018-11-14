package Ex3;
import java.util.Scanner;
public class Ex3_4{
    public static void main(String[]  args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
	    for(int j=1; j<=num; j++){
	        for(int i=1; i<=j; i++)
	            System.out.print("*");
	        System.out.println();
		}
        scan.close();
    }
}