class Solution {
    public boolean isValid(String s) {

       Stack<Character> stack = new Stack<>();
       for(char ch: s.toCharArray())
       {
        if(ch=='(' ||ch=='{'||ch=='[')
            stack.push(ch);
        else{
            if(stack.isEmpty())return false;

            char top = stack.pop();

            if(!isMatching(top,ch))
                return false;    
        }
       } 
       return stack.isEmpty();
    }
    public boolean isMatching(char top, char ch)
    {
        return top =='{' && ch =='}' ||
               top =='(' && ch ==')' ||
               top =='[' && ch ==']';
    }
}
