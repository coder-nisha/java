import java.util.Scanner;

public class EvenOdd2{

    public static void main(String args[]){
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number to be tested for even or odd");
        num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println(" given number  " + num1 + " is even" );

        
        }
        else{
            System.out.println(" given number  " + num1 + " is odd " );

        }
     

    }
}