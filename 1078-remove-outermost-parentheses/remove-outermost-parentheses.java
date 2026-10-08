class Solution {
    public String removeOuterParentheses(String s) {
        int left = 0, right = 0;
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                left++;
            } else {
                right++;
            }

            if(left == right) {
                left = right = 0;
            }
            
            if(left > 1) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}