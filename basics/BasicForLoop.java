public class BasicForLoop {
    
    // Simple for loop example
    public static void printNumbers(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    
    // Sum of n natural numbers
    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    // Nested for loop - multiplication table
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== For Loop Examples ===");
        
        System.out.println("\n1. Print numbers 0-4:");
        printNumbers(5);
        
        System.out.println("\n2. Sum of first 5 natural numbers: " + sumOfNumbers(5));
        
        System.out.println("\n3. Multiplication Table (3x3):");
        printMultiplicationTable(3);
    }
}
