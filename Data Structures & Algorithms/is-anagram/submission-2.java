class Solution {
    public boolean isAnagram(String s, String t) {
        
        int [] frequency = new int[26];

        for(char c: s.toCharArray())
        {
            frequency[c-'a']++;
        }
        for(char c: t.toCharArray())
        {
            frequency[c-'a']--;
        }

        for(int freq: frequency)
        {
            if(freq != 0)
                return false;
        }
        return true;
    }
}
