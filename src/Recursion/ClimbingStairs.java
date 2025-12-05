package Recursion;

// https://leetcode.com/problems/climbing-stairs
// (TLE solutions - not the most optimised solutions)


public class ClimbingStairs {
    public int climbStairs(int n) {

        if(n <= 2) return n;

        return climbStairs(n - 2) + climbStairs(n - 1);

    }
}
