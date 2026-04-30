class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int sub = s1.length(); int len = s2.length();
        int [] ch = new int[26]; //characters
        int [] window = new int[26];

        if(sub > len) return false;
    
        for(char c: s1.toCharArray())ch[c-'a']++;

        //firstWindow
        for(int i=0; i<sub; i++)
            window[s2.charAt(i)-'a']++;
        if(isMatches(ch,window)) return true;

        for(int right =sub; right<len; right++)
        {
            window[s2.charAt(right)-'a']++;

            window[s2.charAt(right-sub)-'a']--;
            if(isMatches(ch,window)) return true;
        }

        return false;
        
       
    }

    public boolean isMatches(int []arr1, int[] arr2)
    {
        return Arrays.equals(arr1,arr2);
    }
}
