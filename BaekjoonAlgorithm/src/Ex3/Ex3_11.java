package Ex3;
import java.util.Scanner;
public class Ex3_11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		for(int i=0; i<s.length(); i++){
			if(i!=0 && i%10==0) System.out.println();
			System.out.print(s.charAt(i));
		}
        scan.close();
    }
}