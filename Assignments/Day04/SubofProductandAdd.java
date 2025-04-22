// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

import java.util.Scanner;

public class SubofProductandAdd {
    static class Solution {
        public int subtractProductAndSum(int n) {
            int mul = 1;
            int add = 0;
            int result = 0;

            while (n>0) {
                int m = n%10;
                mul = mul*m;
                add = add+m;

                n = n/10;
            }
            return mul - add;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the num to ... ");
        Solution sol = new Solution();
        int result = sol.subtractProductAndSum(in.nextInt());
        System.out.println(result);
    }
}
