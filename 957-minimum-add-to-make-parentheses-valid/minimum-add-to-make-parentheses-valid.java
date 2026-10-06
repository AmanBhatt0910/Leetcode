class Solution {
    public int minAddToMakeValid(String s) {
        Stack stack = new Stack();
        int moves = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                stack.push('(');
            } else {
                if(stack.isEmpty()) {
                    moves++;
                    continue;
                }
                stack.pop();
            }
        }

        return moves + stack.size();
    }
}