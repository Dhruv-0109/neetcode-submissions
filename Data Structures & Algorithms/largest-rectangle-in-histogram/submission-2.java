class Solution {
    public int largestRectangleArea(int[] heights) {

       Deque<Integer> stack = new ArrayDeque<>();
       int maxArea = 0; 
       int len = heights.length;

       for(int i=0; i <=len; i++)
       {
           int currentHeight =  (i==len)? 0 : heights[i];
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()])
            {
                int top = stack.pop();
                int height = heights[top];
                int left = (stack.isEmpty())? -1: stack.peek();
                int width = i - left - 1;

                maxArea = Math.max(maxArea,(height*width) );
            }

            stack.push(i);
       }
       return maxArea;
    }
}
/*
    0 -> 7 
        i = 0
        stack -> [0]

    1 -> 1
        i=1
        height = 7
        width = 1:  i-stack.peek()? 
        stack=[1]
    2 -> 7
        stack[1,2]
    3 -> 2
        i = 3
        height = 7
        width = 3 - 2 = 1
        stack[1:1]
        
    4 -> 2
        i=4

    5 -> 4
*/
