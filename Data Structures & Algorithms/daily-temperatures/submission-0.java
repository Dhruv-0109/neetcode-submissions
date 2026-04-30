class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int [] result = new int [len];

        for(int i=0; i<len; i++)
        {
           while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
           { 
            int index = stack.pop();
            result[index] = i - index;
           }
            stack.push(i);
        }

        return result;
    }
}
