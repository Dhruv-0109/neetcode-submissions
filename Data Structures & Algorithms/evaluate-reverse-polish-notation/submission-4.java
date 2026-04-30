class Solution {
    public int evalRPN(String[] tokens) {
        
        if(tokens.length==1) return Integer.parseInt(tokens[0]);
        Deque<String> deque = new ArrayDeque<>();

        for(String s: tokens)
        {
            if(s.matches("-?\\d+(\\.\\d+)?")) //regex for numbers
                deque.push(s);
            else{
                int b = Integer.parseInt(deque.pop());
                int a = Integer.parseInt(deque.pop());
                int result = calculate(a,b,s);
                deque.push(String.valueOf(result));
            }
        }
        int result = Integer.parseInt(deque.pop());
        return result; //?
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
