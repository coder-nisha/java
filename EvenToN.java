import java.util.Scanner;

public class EvenToN{
    public static void main(String args[]){
        int n;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the highest even number");
        n = sc.nextInt();
        while(i < n){
            i++;
            if(i % 2 == 0){
                System.out.println(i + " - even ");
            }
            else{
                System.out.println(i + " - odd ");

            }
        }
    }
}