class Solution {
    public int maxProduct(int n) {
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        int temp = n;
        while(temp != 0) {
            int rem = temp % 10;
            if(rem >= firstMax) {
                secondMax = firstMax;
                firstMax = rem;
            } else if(rem > secondMax) {
                secondMax = rem;
            }

            temp /= 10;
        }

        return firstMax * secondMax;
    }
}