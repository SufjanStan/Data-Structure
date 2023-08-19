package DSA;

public class MinCostClimibingStare {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
//        You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
//        Once you pay the cost, you can either climb one or two steps.
//        You can either start from the step with index 0, or the step with index 1.
//        Return the minimum cost to reach the top of the floor.
//        Example 1:
//
//        Input: cost = [10,15,20]
//        Output: 15
//        Explanation: You will start at index 1.
//                - Pay 15 and climb two steps to reach the top.
//        The total cost is 15.

        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        int total =  Math.min(cost[cost.length-1], cost[cost.length-2]);
        System.out.println(total);
    }
}
