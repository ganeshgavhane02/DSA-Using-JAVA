// Greatest Common Divisor(GCD)
import java.util.*;
class GreatestCommonDivisor {
    public int GCD(int n1, int n2) {
        while(n2 != 0){
            int remainder = n1 % n2;

            n1 = n2;

            n2 = remainder;
        }
        return n1;

    }
}

           public class GDGmain{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter two number to find GDG");
                int n1 = sc.nextInt();
                int n2= sc.nextInt();
                GreatestCommonDivisor gcdclaulator = new GreatestCommonDivisor();
                int result = gcdclaulator.GCD(n1, n2);
                System.out.println("GCD is: " + result);

                
            }
           }