class Solution {
    public int evalRPN(String[] tokens) {
        
        if(tokens.length==1) return Integer.parseInt(tokens[0]);
        Deque<Integer> stack = new ArrayDeque<>();

        for(String s: tokens)
        {
            if(Character.isDigit(s.charAt(s.length()-1))) //regex for numbers
                stack.push(Integer.parseInt(s));
            else{
                int b = stack.pop();
                int a = stack.pop();
                int result = calculate(a,b,s);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public int calculate(int a, int b, String operator )
    {
        switch(operator)
        {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: return 0;
        }
    }
}
