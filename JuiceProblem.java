import java.util.Scanner;

public class JuiceProblem{
    public static void main(String args[]){
        int l, m, s;
        Double glasses;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input for large oranges");
        l = sc.nextInt();
        System.out.println("Input for medium oranges");
        m = sc.nextInt();
        System.out.println("Input for small oranges");
        s = sc.nextInt();
        glasses = new Double((l)) + new Double((m / 2)) + new Double((s / 4));
        System.out.println(glasses);


    }
    

}