import java.util.Scanner;

public class FourTwoOneProblem{
    static int i = 0;
    public static void main(String args[]){
        int num;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Input the number");
        num = sc.nextInt();
        i++;
        calc(num);
        
    }
    public static void calc(int a){
        int temp;
    
        if(a % 2 ==0){
            temp = a / 2;
           
        }
    else{
        temp = a * 3 + 1;
        
    }
    System.out.println(temp);
    if(temp != 1){
        i++;
        calc(temp);
        
    }
    else{
        i++;
        System.out.println("The number of tries is " +i);
    }
    }
    

}