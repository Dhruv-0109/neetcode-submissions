class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        
        HashMap<Character,Integer> input1 = new HashMap<>();
        HashMap<Character,Integer> input2 = new HashMap<>();

        int len = s.length();

        for(int i=0; i<len ; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            input1.put(ch1, input1.getOrDefault(ch1, 0)+1);
            input2.put(ch2, input2.getOrDefault(ch2, 0)+1);
        }

        return input1.equals(input2);



    }
}
