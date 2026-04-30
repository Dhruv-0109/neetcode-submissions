class Solution {
    public int maxProduct(int[] nums) {
      int max = nums[0];
      int min = nums[0];
      int result = nums[0];
      int len = nums.length;  

      for(int i=1; i<len; i++)
      {
        int num = nums[i];

        if(num < 0)
        {
            int temp = min;
            min = max;
            max = temp;
        }

        max = Math.max(num, num*max);
        min = Math.min(num, num*min);

        result = Math.max(result, max);
      }

      return result;
    }
}
