class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder result = new StringBuilder();

        int totalNine = sum / 9;
        int remaining = sum % 9;

        while(totalNine != 0) {
            result.append('9');
            totalNine--;
        }

        if(remaining != 0) {
            result.append(remaining);
        }

        if(result.length() > num) {
            return "";
        }

        int zeroes = num - result.length();
        while(zeroes != 0) {
            result.append('0');
            zeroes--;
        }

        return result.toString();
    }
}