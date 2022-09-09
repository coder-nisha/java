import java.util.Scanner;

public class Concatination2{
    public static void main(String args[]){
        String str1, str2, str3, concat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first word");
        str1 = sc.nextLine();
        System.out.println("Input the second word");
        str2 = sc.nextLine();
        System.out.println("Input the third word");
        str3 = sc.nextLine();
        concat = str1 + " " + str2 + " " + str3;
        System.out.println("Concatnation of " + str1 + " and " + str2 + " and " + str3 + " is " + concat);
    }
}