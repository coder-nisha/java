import java.util.Scanner;

public class PallindromeNumber{
    public static void main(String args[]){
        long num;
        long r;
        long opp = 0L;
        long dup;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        num = sc.nextLong();
        dup = num;
        while(num > 0){
            r = num % 10; 
            opp = opp * 10 + r;
            num = num / 10;
            

        }
        if(opp == dup){
        System.out.println(dup + " is a pallidrome");
    }
        else{
            System.out.println(dup + "is not a pallidrome");  

    }

    }
}