import java.util.Scanner;

public class SumOfNumbers3{
    public static void main(String args[]) {
        Double num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first number");   
        num1 = sc.nextDouble();
        System.out.println("Write the second number");
        num2 = sc.nextDouble();
        sum = Sum(num1, num2);
        System.out.println("The sum is " +sum );

    }

public static Double Sum(Double a, Double b){
    return a+b;

}

}