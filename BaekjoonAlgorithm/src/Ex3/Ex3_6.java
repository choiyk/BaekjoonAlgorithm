package Ex3;
import java.util.Scanner;
public class Ex3_6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0; i<num; i++){
			StringBuilder sb = new StringBuilder();
			for(int j=num-i; j>0; j--)
				sb.append("*");
			System.out.println(sb.toString());
		}
        scan.close();
    }
}