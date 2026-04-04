public class BinarySearch {
    
    // Binary search for a target in sorted array
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Element not found
    }
    
    // Recursive binary search
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Target: " + target);
        
        int iterativeResult = binarySearch(arr, target);
        System.out.println("Iterative Binary Search - Found at index: " + iterativeResult);
        
        int recursiveResult = binarySearchRecursive(arr, target, 0, arr.length - 1);
        System.out.println("Recursive Binary Search - Found at index: " + recursiveResult);
    }
}
