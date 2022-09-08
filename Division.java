import java.util.Scanner;

public class Division{
    public static void main(String args[]){
        int num1, num2, quo, rem;
        Scanner sc = new Scanner(System.in); //Scanner is a type sc is the instanc new means to intialized the constructor and Scanner is the constructor method and System.in inputto the constructor
        System.out.println("Input the dividend");
        num1 = sc.nextInt();
        System.out.println("Input the divisor");
        num2 = sc.nextInt();
        quo = num1 / num2;
        rem = num1 % num2;
        System.out.println("The quotient is "+quo+ " and the reminder is "+ rem);
    }   
}