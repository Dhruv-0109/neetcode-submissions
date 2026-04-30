class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] output = new int[len];
        int prefix = 1;
        
        
        for( int i=0; i<len; i++)
        {
            output[i] = prefix;
            prefix *=nums[i];

        }

        //POSTFIX
        int postfix = 1;

        for(int i = len-1; i>=0; i--)
        {
            output[i] *= postfix;
            postfix *= nums[i];
        }
        return output;
    }
}  
