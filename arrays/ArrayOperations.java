public class ArrayOperations {
    
    // Find the maximum element in array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    // Find the minimum element in array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    // Calculate sum of array elements
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    // Calculate average of array elements
    public static double arrayAverage(int[] arr) {
        return (double) arraySum(arr) / arr.length;
    }
    
    // Reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {45, 23, 89, 12, 56, 34, 78};
        
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
        System.out.println("Maximum: " + findMax(arr));
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Sum: " + arraySum(arr));
        System.out.println("Average: " + arrayAverage(arr));
        
        reverseArray(arr);
        System.out.println("Reversed Array: " + java.util.Arrays.toString(arr));
    }
}
