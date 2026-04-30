class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        
        
        int len = s.length();
        int [] count = new int[26]; //result

        for(int i=0; i<len ; i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
            
        }

        for(int n : count)
        {
            if(n!=0) return false;
        }

        return true;
    }
}
