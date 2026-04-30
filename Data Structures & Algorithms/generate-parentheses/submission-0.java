class Solution {
    public List<String> generateParenthesis(int n) {
        
        if(n == 1) return new ArrayList<>(Arrays.asList("()"));
        
        List<String> result = new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;

    }

    private void backtrack(List<String>result, String current, int open, int close, int n)
    {
        //Base case:
        if(current.length()==2*n)
        {
            result.add(current);
            return;
        }

        //Add open parenthesis if we have open slots
        if(open < n)
            backtrack(result,current+"(",open+1,close,n);
        
        if(close < open)
            backtrack(result, current+")", open,close+1,n);
    }
}
