class Solution {
    public int countPrimeSetBits(int left, int right) {
        int primeSetBits = 0;

        for(int i = left; i <= right; i++) {
            int bitCount = Integer.bitCount(i);
            if(isPrime(bitCount)) {
                primeSetBits++;
            }
        }

        return primeSetBits;
    }

    private static boolean isPrime(int setBits) {
        if(setBits < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(setBits); i++) {
            if(setBits % i == 0) {
                return false;
            }
        }

        return true;
    }
}