import java.util.Scanner;

public class PrintOrignalNumber{
    public static void main(String args[]){
        Long num;
        Long r;
        Long sum = 0L;
        Long opp = 0L;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextLong();
        while(num > 0){
           r = num % 10;
           opp = opp * 10 + r;
            num = num / 10;
            System.out.println(r);

        }
        while(opp > 0){
            r = opp % 10;
            sum = sum + r;
            System.out.println(r);
            opp = opp / 10;
            
        }
        System.out.println(sum);
            
    }
}