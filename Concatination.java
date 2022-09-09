import java.util.Scanner;

public class Concatination{
    public static void main(String args[]){
        String str1, str2, concat;
        System.out.println("Input the first string");
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        System.out.println("Input the second string");
        str2 = sc.nextLine();
        concat = Concat(str1, str2);
        System.out.println(" Concatination of " + str1 + " and " + str2 + " is " + concat);
        
    }
    public static String Concat(String a,String b){
        return a +" " + b;
    }
}