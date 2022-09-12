import java.util.Scanner;

public class SumOfEvenAndOdd{
    public static void main(String args[]){
        Long num;
        Long evensum = 0L;
        Long oddsum = 0L;
        Long sum = 0L;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextLong();
        while(num > 0){
            evensum = evensum + Even(num % 10);
            oddsum = oddsum + Odd(num % 10);
            sum = sum  + (num % 10);
            num = num / 10;
        }
        System.out.println("The sum of even digits is " + evensum);
        System.out.println("The sum of odd digits is " + oddsum);
        System.out.println("the sum of total number is " + sum);



    }
    private static Long Even(Long n){
        if(n % 2 == 0){
            return n;
        }
        else{
            return 0L;
        }
    }
    private static Long Odd(Long a){
        if(a % 2 != 0){
            return a;
        }else{
            return 0L;

        }
    }
}

