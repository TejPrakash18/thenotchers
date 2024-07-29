## Kadane's Algorithm
Kadane's Algorithm is a dynamic programming technique used to find the maximum sum of a contiguous subArray in an array of integers. This algorithm operates in linear time, making it very efficient for solving this problem.
 
### where to use

1. find the largest sum of subArray
2. find the subArray.
3. find the maximum product of subArray

### Approach 
1. `Initialization:`
Initialize two variables, maxEndingHere and maxSoFar.
maxEndingHere keeps track of the maximum sum of the subArray ending at the current position.
maxSoFar stores the maximum sum found so far.
2. `Iteration:`
Traverse through the array.
At each position, update maxEndingHere to be the maximum of the current element alone or the current element plus the maximum sum ending at the previous position.
Update maxSoFar to be the maximum of itself or maxEndingHere.
3. `Result:`
maxSoFar will contain the maximum sum of the contiguous subArray at the end of the iteration. 

```java
// maxSubArraySum
public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Sum Subarray: " + maxSubArraySum(nums)); // Output: 6
    }
}

```

```java
//maxSubArrayProduct
public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        // Initialize the variables
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap maxProduct and minProduct if the current number is negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Calculate the maximum and minimum product ending at the current position
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            // Update the result
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums1)); // Output: 6

        int[] nums2 = {-2, 0, -1};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums2)); // Output: 0

        int[] nums3 = {-2, 3, -4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums3)); // Output: 24
    }
}


```