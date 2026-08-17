class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];

            if(freq.containsKey(toFind)) {
                return new int[] {i, freq.get(toFind)};
            }

            freq.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}