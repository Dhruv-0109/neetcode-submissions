class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        if(temperatures.length<=1) return new int[]{0};

        Deque<Integer> deque = new ArrayDeque<>();
        int len = temperatures.length;
        int [] result = new int[len];

        for(int i=0; i<len; i++)
        {
            int current = temperatures[i];

            while(!deque.isEmpty() && temperatures[deque.peek()] < current)
                result[deque.peek()] = i - deque.pop();
            
            deque.push(i);
        }

     return result;
    }
}
