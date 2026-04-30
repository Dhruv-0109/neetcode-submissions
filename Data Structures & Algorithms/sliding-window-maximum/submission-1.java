class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int len = nums.length;
        if (len == 0) return new int[0];

        int [] max = new int [len-k+1];
        int index = 0;

        for(int left =0; left<=len-k; left++)
        {
            int windowMax = Integer.MIN_VALUE;

            for(int j=left; j<left+k; j++)
            {
                windowMax = Math.max(windowMax,nums[j]);
            }
            max[index++] = windowMax;
        }
        return max;
    }
}
