class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len == 0) return new int[0];  

        int [] max = new int[len-k +1];
        Deque<Integer>deque = new ArrayDeque<>(); //stores indices
        int index = 0;

        for(int right=0; right<len; right++)
        {
            // 1️⃣ Remove elements out of window (left side)
            while (!deque.isEmpty() && deque.peek() < right - k + 1) {
                deque.poll();
            }

             // 2️⃣ Remove smaller elements since they won’t be useful
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[right]) {
                deque.pollLast();
            }

              // 3️⃣ Add current element index
            deque.offer(right);

            // 4️⃣ Store the max value when the first window is formed
            if (right >= k - 1) {
                max[index++] = nums[deque.peek()];
            }
        }

       return max; 
    }
}
