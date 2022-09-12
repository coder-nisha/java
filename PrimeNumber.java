import java.util.Scanner;

public class PrimeNumber{
    public static void main(String args[]){
        int num;
       Boolean prime;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        num = sc.nextInt();
        prime = Prime(num);
        if(prime == true){
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " is not prime number");
        }
        
    }
    public static Boolean Prime(int num){
        int i = 2;
        Boolean prime = true; 
        while(  i < num){
            if( num % i == 0){
                prime = false;
                break;
            }
            
                
            
            i++;
        }
        return prime;

    }

}