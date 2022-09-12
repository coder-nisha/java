import java.util.Scanner;

public class PrimeNumber3{ 
    public static void main(String args[]){
        int n;
        Boolean prime;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
      prime = Prime(n);
      if(prime == true){
        System.out.println(n + " is prime ");
      }
      else{
        System.out.println(n + " is not prime");
      }

        }
        public static Boolean Prime(int n){
            int counter = 2;
            
            while(counter < n){
                if(n % counter == 0){
                    return false;
                }
                counter++;
            }
                
                
               return true;
         
    }
}

    
