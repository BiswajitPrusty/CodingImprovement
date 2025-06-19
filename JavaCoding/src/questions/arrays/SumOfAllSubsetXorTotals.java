package questions.arrays;



public class SumOfAllSubsetXorTotals {
    public static void main(String[] args) {
        System.out.println(subsetXORSum(new int[]{5, 1, 6}));
    }

    public static int subsetXORSum(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total |= num;  // Step 1: Compute bitwise OR of all numbers
        }
        return total * (1 << (nums.length - 1));  // Step 2: Multiply by 2^(n-1)
    }
}
