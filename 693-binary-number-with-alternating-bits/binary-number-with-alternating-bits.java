class Solution {
    public boolean hasAlternatingBits(int n) {
        String binaryRep = Integer.toBinaryString(n);
        int maxSetBit = 0;
        
        for(int i = 1; i < binaryRep.length(); i++) {
            if(binaryRep.charAt(i-1) == binaryRep.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}