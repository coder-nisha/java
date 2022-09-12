import java.util.Scanner;

public class SumOfPrime{
public static void main(String args[]){
    Long num;
    
    Long sum = 0L;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    num = sc.nextLong();

    while(num > 0){
       sum = sum + (num % 10);
       
       num = num / 10;
       
    }
    System.out.println(sum);

    
    
   

}
}