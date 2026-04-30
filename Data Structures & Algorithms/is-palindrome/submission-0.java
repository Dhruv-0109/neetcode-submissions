class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.trim().toLowerCase();

        if(s.isEmpty())
            return true;
        else
          {
            int start = 0; int end = s.length()-1;

            while(start<end)
            {
                if(s.charAt(start)!=s.charAt(end))
                    return false;
                start++; end--;
            }
          }
          return true;

    
        

        

        
    }

   
}
