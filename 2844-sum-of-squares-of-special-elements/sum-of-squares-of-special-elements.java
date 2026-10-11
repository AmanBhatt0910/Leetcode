class Solution {
    public int sumOfSquares(int[] nums) {
        int length = nums.length;
        int result = 0;

        for(int i = 0; i < length; i++) {
            if(length % (i+1) == 0) {
                result += (nums[i] * nums[i]);
            }
        }

        return result;
    }
}