package Ex1_2;
import java.util.Scanner;
public class Ex12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sugar = scan.nextInt();
        int quotient = sugar/5;
        int remainder = sugar%5;
        if(remainder != 0){
            for(int i = quotient; i>=0 ; i--){
                quotient = (sugar - (5*i))/3;
                remainder = (sugar - (5*i))%3;
                if(remainder == 0 ){
                    quotient += i;
                    break;
                }
            }
        }
        if(remainder == 0)
            System.out.println(quotient);
        else
            System.out.println(-1);
        scan.close();
    }
}