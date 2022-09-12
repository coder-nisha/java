import java.util.Scanner;

public class SumOfOppAndOrig {
   public static void main(String args[]){
    long num;
    long opp = 0L;
    long r;
    long dup;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers");
    num = sc.nextInt();
    dup = num;
    while(num > 0){
        r = num % 10;
        opp = opp * 10 + r;
        num = num / 10;
        
    }
    System.out.println(opp + dup);
   } 
}
