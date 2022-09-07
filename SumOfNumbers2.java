import java.util.Scanner;

public class SumOfNumbers2{
    public static void main(String args[]) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first number");   
        num1 = sc.nextInt();
        System.out.println("Write the second number");
        num2 = sc.nextInt();
        sum = Sum(num1, num2);
        System.out.println("The sum is " +sum );

    }

public static int Sum(int a, int b){
    return a+b;

}

}