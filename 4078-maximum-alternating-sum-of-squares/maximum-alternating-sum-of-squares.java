class Solution {
    public long maxAlternatingSum(int[] nums) {
        int size = nums.length;
        long[] squares = new long[size];
        for(int i = 0; i < size; i++) {
            squares[i] = (long) Math.pow(nums[i], 2);
        }
        
        Arrays.sort(squares);

        long score = 0;
        int left = 0, right = size - 1;
        while(left < right) {
            score += squares[right--];
            score -= squares[left++];
        }

        if(left == right) {
            score += squares[right];
        }

        return score;
    }
}