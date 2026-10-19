class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int size = nums.length;
        int[] temp = new int[size];
        for(int i = 0; i < size; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            if(temp[i] == target) {
                result.add(i);
            }
        }

        return result;
    }
}