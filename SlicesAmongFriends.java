import java.util.Scanner;

public class SlicesAmongFriends{
    public static void main(String args[]){
        int num1, num2, num3;
        Scanner sc = new Scanner (System.in);
        System.out.println("Number of slices");
        num1 = sc.nextInt();
        System.out.println("number of friends");
        num2 = sc.nextInt();
        num3 = num1 % num2;
        if(num3 == 0){
            System.out.println(" The number of slices can be evenly distributed");
        
        }
        else{
        System.out.println(" The number of slices can not be evenly distributed");
    }

        
    }
}