package Ex3;
import java.util.Scanner;
public class Ex3_10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		String input = scan.nextLine();
		int sum=0;
		for(int i=0; i<num; i++)
			sum += input.charAt(i)-'0';
		System.out.println(sum);
        scan.close();
    }
}