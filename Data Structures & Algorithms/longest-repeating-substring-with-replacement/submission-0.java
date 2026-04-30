class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
       
        int []ch = new int[26]; //0 based index

        
        int count = 0;
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        
       
        for(int right=0; right<len; right++)
        {
            char c= s.charAt(right);
            
            ch[c-'A']++;

            maxFreq = Math.max(maxFreq,ch[c-'A']);
            int windowSize = right - left +1;

            while(windowSize - maxFreq > k)
            {
                ch[s.charAt(left)-'A']--;
                left++;
                windowSize = right-left+1;
            }

            maxLength =Math.max(windowSize, maxLength);
        }
        
        
        return maxLength;
                
    }
}
