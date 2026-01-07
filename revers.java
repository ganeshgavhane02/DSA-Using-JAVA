public class revers {
    public static void main(String[] args) {
        int n = 1234;
        int reversedNUmbers = 0;
        while (n>0) {
            int lastdigit = n % 10;
            reversedNUmbers = reversedNUmbers * 10 + lastdigit;
            n = n / 10;
            
        }
        System.out.println(reversedNUmbers);
    }
}