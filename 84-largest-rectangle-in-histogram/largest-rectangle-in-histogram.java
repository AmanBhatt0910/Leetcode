class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while(!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int rightBoundary = i;
                int leftBoundary = (stack.isEmpty()) ? -1 : stack.peek();

                int area = height * (rightBoundary - leftBoundary - 1);
                maxArea = Math.max(area, maxArea);
            }
            stack.push(i);
        }

        return maxArea;
    }
}