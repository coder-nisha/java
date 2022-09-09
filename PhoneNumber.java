public class PhoneNumber{
    public static void main(String args[]){
        long a = 8981065228L;
        while(a > 0){
            System.out.println("The digit of the numbers are " + a % 10);
            a = a / 10;

        }
    }
}