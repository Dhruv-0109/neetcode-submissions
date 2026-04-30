class Solution {

    public String encode(List<String> strs) {

        if(strs.isEmpty()) return "";
        StringBuilder result = new StringBuilder();
        
        for(String s: strs)
            result.append(s.length()).append('#').append(s);
        return result.toString();
    }

    public List<String> decode(String str) {

        if(str.length() == 0)return new ArrayList<>();
        List<String> result = new ArrayList<>();
        int len = str.length();
        int i = 0;

        while(i < len)
        {
            int j = i;

            while(str.charAt(j) != '#')
              j++;
            
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = i+length;

            result.add(str.substring(i,j));
            i = j;

        }

        return result;

    }
}
