## Two Pointer technique :

commonly used to solve Array or Linked-list problem. to solve a problem more efficiently than with nested loop

### where to use.

1. Finding SubArray with a specific property
2. merging two sorted Array
3. finding pair in an array that up to a specific value.

### Basic approach 

1. initialize two pointer, according to the problem statement
2. move the pointer according to problem requirement
3. perform operation or check condition as the pointer move
4. the process condition until the pointer meet or cross each other, or until a specific condition is meet

#### tip
sorted Array, opposite direction, avoiding nested loop, condition-based moment like more 

```java
// sum of two 

public static void twoSum(int[] numbers,int target){
        int p1 = 0;
        int p2 = numbers.length-1;

        while (p1 < p2){
            if(numbers[p1] + numbers[p2] == target){
                System.out.println(( p1+1 )+" "+( p2+1));
            }
            if(numbers[p1] + numbers[p2] > target){
                p2--;
            }
            else{
                p1++;
            }
        }
    }
```