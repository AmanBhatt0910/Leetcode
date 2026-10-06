class Solution {
    public int longestValidParentheses(String s) {
        int size = s.length();
        Stack<Integer> stack = new Stack();
        stack.push(-1);
        int maxLength = 0;

        for(int i = 0; i < size; i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if(stack.size() == 0) {
                    stack.push(i);
                    continue;
                }
                int length = i - stack.peek();
                maxLength = Math.max(length, maxLength);
            }
        }

        return maxLength;
    }
}