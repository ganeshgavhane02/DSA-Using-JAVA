class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
             return false;
        }
        int dublicate = n;
        
        int reverse = 0;
        while(n>0){
            int id = n % 10;
            reverse = reverse * 10 + id;
            n = n / 10;
        }
       
        if(dublicate == reverse){
             return true;

        }
        else{
             return false;
        }
        

    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 121;
        System.out.println(sol.isPalindrome(n));
    }
}