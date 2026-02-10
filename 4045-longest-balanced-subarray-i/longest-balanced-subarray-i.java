class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        HashSet<Integer> even = new HashSet<>();
        HashSet<Integer> odd = new HashSet<>();
        int longestBalanced = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(nums[j] % 2 == 0) {
                    even.add(nums[j]);
                } else {
                    odd.add(nums[j]);
                }
                if(even.size() == odd.size())  {
                    longestBalanced = Math.max(longestBalanced, (j - i + 1));
                }
            }
            even.clear();
            odd.clear();
        }

        return longestBalanced;
    }
}