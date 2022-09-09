import java.util.Scanner;

public class FourTwoOneProblem{
    public static void main(String args[]){
        int num;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Input the number");
        num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num/2);
        }
        else{
            System.out.println(num * 3 + 1);
        }
    }
}