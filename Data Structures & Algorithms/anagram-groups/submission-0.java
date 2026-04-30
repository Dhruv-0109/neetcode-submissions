class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        

        for(String s: strs)
        {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);

            StringBuilder sortedKey = new StringBuilder();
            for(char c: ch)
               sortedKey.append(c);
            String key = sortedKey.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);   
        }
        List<List<String>> result = new ArrayList<>(map.values());

        return result;



        
        
    }
}
