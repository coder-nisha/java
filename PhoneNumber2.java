public class PhoneNumber2{
    public static void main(String args[]){
        long n = 8981065228L;
        long o = 0L;
        long r;
        while(n > 0){
            r = n % 10;
            o = o * 10 + r;
            n = n / 10;
            
                }
        while(o > 0){
            System.out.println(o % 10);
            o = o / 10;
        }
    }
}