class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String s:tokens){
            if(s.matches("[-+]?\\d+"))
                stack.push(Integer.valueOf(s));
            else{
                int first = stack.pop();
                int second = stack.pop();

                int result = 0;

                switch(s)
                {
                   case "+": 
                    result = second+first;
                    break;
                   case "-": 
                    result = second-first;
                    break;
                   case "*": 
                    result = second*first;
                    break;
                   case "/": 
                    result = second/first;
                    break;

                }
                stack.push(result);
            }
        }

        return stack.pop();
    }
}
