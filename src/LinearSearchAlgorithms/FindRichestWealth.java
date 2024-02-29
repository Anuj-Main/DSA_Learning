package LinearSearchAlgorithms;

//https://leetcode.com/problems/richest-customer-wealth/
public class FindRichestWealth {
    public static void main(String[] args) {

    }

    // person=row
    // accounts=column
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have a sum of accounts of a person
            // check with overall answer
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
