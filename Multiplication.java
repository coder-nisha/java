import java.util.Scanner;

public class Multiplication{

public static void main(String args[]){
    int num1, num2, pro;
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the first number");
    num1 = sc.nextInt();
    System.out.println("Input the second number");
    num2 = sc.nextInt();
    pro = Multiply(num1, num2);
    System.out.println("Product of "+num1 + " and "+num2 + " is " +pro);

 }
 public static int Multiply(int a, int b){
    return a*b;
 }
}
