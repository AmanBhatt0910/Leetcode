class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        
        Arrays.sort(nums);
        long maxAlternatingScore = 0;

        int i = 0, j = nums.length - 1;
        while(i < j) {
            maxAlternatingScore += nums[j--];
            maxAlternatingScore -= nums[i++];
        }

        if(i == j) {
            maxAlternatingScore += nums[j];
        }

        return maxAlternatingScore;
    }
}