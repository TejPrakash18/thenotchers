## Kadane's Algorithm
Kadane's Algorithm is a dynamic programming technique used to find the maximum sum of a contiguous subArray in an array of integers. This algorithm operates in linear time, making it very efficient for solving this problem.
 
### where to use

1. find the largest sum of subArray
2. find the subArray.
3. find the maximum product of subArray

### Approach 
1. `Initialization:`
Initialize two variables, maxEndingHere and maxSoFar.
maxEndingHere keeps track of the maximum sum of the subarray ending at the current position.
maxSoFar stores the maximum sum found so far.
2. `Iteration:`
Traverse through the array.
At each position, update maxEndingHere to be the maximum of the current element alone or the current element plus the maximum sum ending at the previous position.
Update maxSoFar to be the maximum of itself or maxEndingHere.
3. `Result:`
maxSoFar will contain the maximum sum of the contiguous subarray at the end of the iteration.. 

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
public class KadanesAlgorithm {
    public static int[] maxSubArraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        int start = 0, end = 0, s = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxEndingHere + nums[i]) {
                maxEndingHere = nums[i];
                s = i;
            } else {
                maxEndingHere += nums[i];
            }

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
            }
        }

        return new int[]{maxSoFar, start, end};
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] result = maxSubArraySum(nums);
        System.out.println("Maximum Sum: " + result[0]); // Output: 6
        System.out.println("Subarray: [" + result[1] + ", " + result[2] + "]"); // Output: [3, 6]
    }
}

```