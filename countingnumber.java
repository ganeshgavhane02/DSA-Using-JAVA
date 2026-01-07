public class countingnumber {
    public static void main(String[] args) {
        int n = 230;
        System.out.println(Countdigit(n));
    }
    public static int Countdigit (int n){
        if (n==0){
            return 1;
        }
        int count =0;
        while (n>0){
            n = n/10;
            count++;
        }
        return count;
    }

}