class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] wrapperObjectArray = new Integer[arr.length];
        int i = 0;
        for(int val : arr) {
            wrapperObjectArray[i] = Integer.valueOf(val);
            i++;
        }

        Arrays.sort(wrapperObjectArray, (val1, val2) -> {
            int val1_oneBits = countBits(val1);
            int val2_oneBits = countBits(val2);

            return (val1_oneBits == val2_oneBits ? val1 - val2 : val1_oneBits - val2_oneBits);
        });

        i = 0;
        for(int val : wrapperObjectArray) {
            arr[i] = val;
            i++;
        }

        return arr;
    }

    public int countBits(int val) {
        int bitCount = 0;
        while(val != 0) {
            bitCount += (val & 1);
            val = val >> 1;
        }

        return bitCount;
    }
}