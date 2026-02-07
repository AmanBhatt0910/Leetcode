class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int duplicate = nums[0];

        int sum = 0;
        for(int num : nums) {
            if(set.contains(num)) {
                duplicate = num;
            }
            set.add(num);
            sum += num;
        }


        int totalSum = (n * (n + 1)) / 2;
        int missing = totalSum - sum + duplicate;

        return new int[] {duplicate, missing};
    }
}