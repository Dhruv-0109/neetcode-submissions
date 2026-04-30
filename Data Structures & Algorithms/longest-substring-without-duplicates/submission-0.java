class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()<1)
            return 0;
        if(s.length()==1)
            return 1;
        
        int [] ch = new int[128];
        int len = s.length();

        int left = 0;
        int maxLength = 0;
        for(int right = 0; right<len; right++)
        {
            char c = s.charAt(right);
            ch[c]++;

            while(ch[c]>1)
            {
                ch[s.charAt(left)]--;
                left++;
            }
            maxLength = Math.max(maxLength, (right-left+1)) ;    
        }

        return maxLength;
    }
}
