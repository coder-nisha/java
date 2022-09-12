import java.util.Scanner;

public class PrimeInnumbers{
    public static void main(String args[]){
        long num ;
        long r;
        long opp = 0L;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        num = sc.nextLong();
        while(num > 0){
            r = num % 10;
            opp = opp * 10 + r;
            num = num / 10;
        
        }
        while(opp > 0){
            r = opp % 10;
            Prime(r);
            opp = opp / 10;
        }

    }
    public static void Prime(Long a){
         Long counter = 2L;
         while(counter < a){
           if( a % counter == 0){
            return;

           }
           counter++;

         }
         System.out.println(a);
    }
}