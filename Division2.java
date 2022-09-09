import java.util.Scanner;

public class Division2{
    public static void main(String args[]){
        int num1, num2, quo, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the diviend");
        num1 = sc.nextInt();
        System.out.println("Input the divisor");
        num2 = sc.nextInt();
        System.out.println("input quo " + num1 / num2 + " rem " + num1 % num2 );
        }
} 