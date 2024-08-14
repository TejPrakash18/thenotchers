package Leetcode.Greedy;

import java.util.Arrays;
import java.util.Collections;

public class minimumCostToBuyCandies {
    public static int minimumCost(int[] cost) {
        int ans = 0;

        cost = Arrays.stream(cost)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();


            for (int i = 0; i < cost.length; ++i)
                if (i % 3 != 2)
                    ans += cost[i];
        return ans;
    }

    public static void main(String[] args) {
        int[] cost  = {6,5,8,9,2,2};
        int answer = minimumCost(cost);

        System.out.println(answer);
    }
}
