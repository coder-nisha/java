import java.util.Scanner;

public class HighestNumberOfNotes{
    public static void main(String args[]){
        int n, n2000, n500, n100, n50, n20, n10, n5, n2, n1 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the amount");
        n = sc.nextInt();
        n2000 = n / 2000;
        n = n % 2000;
        n500 = n / 500;
        n = n % 500;
        n100 = n / 100;
        n = n % 100;
        n50 = n / 50;
        n = n % 50;
        n20 = n / 20;
        n = n % 20;
        n10 = n / 10;
        n = n % 10;
        n5 = n / 5;
        n = n % 5;
        n2 = n / 2;
        n = n % 2;
        n1 = n / 1;
        n = n % 1;
        System.out.println("The number of 2000 rs are " + n2000);
        System.out.println("The number of 500 rs are " + n500);
        System.out.println("The number of 100 rs are " + n100);
        System.out.println("The number of 50 rs are " + n50);
        System.out.println("The number of 20 rs are " + n20);
        System.out.println("The number of 10 rs are " + n10);
        System.out.println("The number of 5 rs are " + n5);
        System.out.println("The number of 2 rs are " + n2);
        System.out.println("The number of 1 rs are " + n1);
        
        
        
        
        
        
      
       
    }
}