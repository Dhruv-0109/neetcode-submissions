class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int max = 0;
        int len = heights.length;
        Stack <Integer> stack = new Stack<>();

        for(int i = 0; i <= len; i++)
        {
            int h = (i==len)? 0: heights[i];
            while(!stack.isEmpty() && h<heights[stack.peek()])
            {
                int height = heights[stack.pop()];
                int width = stack.isEmpty()? i: i - stack.peek() - 1;
                int area = height * width;
                max = Math.max(max,area);
            }
            stack.push(i);
        }

        return max;
    }
}
