import java.util.Scanner;

public class ListprimeBetweenTwoNumbers{
    public static  void main(String args[]){
    int snum, lnum;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    snum = sc.nextInt();
    System.out.println("Enter the second number");
    lnum = sc.nextInt();
    while(snum <= lnum){
        prime(snum);
        snum++;

    }

    }
    public static void prime(int i){
        int counter = 2;
        while(counter < i){
            if(i % counter == 0){
                return;
            }
            counter++;
        }
        System.out.println(i);
    }


}