class Solution {
    public String minWindow(String s, String t) {
        

        int [] freq = new int[52]; int [] window = new int[52];
        int required = 0;
        int matched = 0; int minLen = Integer.MAX_VALUE; 
        int minStart= 0; int len = s.length(); int left = 0;

        for(char c: t.toCharArray())
        {
            if(Character.isUpperCase(c))
                freq[c-'A']++;
            else
                freq[c-'a'+26]++;
        }

        for(int val: freq)
        {
            if(val>0)required++;
        }
        
        for(int right=0; right<len; right++)
        {

            char r = s.charAt(right);

             if(Character.isUpperCase(r))
            {
                window[r-'A']++;
                if (window[r - 'A'] == freq[r - 'A'])matched++; 
            }
            else
            {    
                window[r-'a'+26]++;
                if(window[r-'a'+26] == freq[r-'a'+26])matched++;
            }

            while(matched==required)
            {
                char l = s.charAt(left);

                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    minStart = left;
                }

                if(Character.isUpperCase(r))
                {
                    if(window[l-'A'] == freq[l-'A'])matched--;
                    window[l-'A']--;
                }
                else{
                    if(window[l-'a'+26]== freq[l-'a'+26])matched--;
                    window[l-'a'+26]--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE? "":s.substring(minStart,minStart+minLen);
    }
}
