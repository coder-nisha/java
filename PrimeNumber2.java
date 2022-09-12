import java.util.Scanner;

public class PrimeNumber2{ 
    public static void main(String args[]){
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
       Prime(n);

        }
        public static void Prime(int n){
            int counter = 2;
            Boolean pr = true;
            while(counter < n){
                if(n % counter == 0){
                    System.out.println(n + " is not prime ");
                    pr = false;
                    break;
                }
                counter++;
                
                }
                if(pr == true){
                 System.out.print(n + " is prime ");
                }
        } 
    }
    
