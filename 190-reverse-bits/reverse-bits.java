class Solution {
    public int reverseBits(int n) {
        int result = 0;

        for(int i = 0; i < 32; i++) {
            if((n & 1) > 0) {
                result = (result | 1);
            }
            n = n >> 1;
            result = (i < 31) ? result << 1 : result;
        }

        return result;
    }
}