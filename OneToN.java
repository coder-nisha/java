import java.util.Scanner;

public class OneToN{
    public static void main(String args[]){
        int n;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("untill what number you want to print");
        n = sc.nextInt();
        while(i < n){
            i++;
            System.out.println(i);
        }
    }
}