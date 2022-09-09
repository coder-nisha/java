import java.util.Scanner;

public class EvenOdd{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number");
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("The number " + num + " is even");
        
        }
        else{
            System.out.println("The number " + num + " is odd"); 
        }
    }
}