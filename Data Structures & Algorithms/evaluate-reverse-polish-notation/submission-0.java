class Solution {
    public int evalRPN(String[] tokens) {
        int answer = 0;
        Stack <String> stack = new Stack<>();
        
          for(String s: tokens)
        {
            if(s.matches("[-+]?\\d+"))
                stack.push(s);
            
            else{
                String operator = s;
                int first =  Integer.valueOf(stack.pop());
                int second = 0;
                if(!stack.isEmpty())
                    second = Integer.valueOf(stack.pop());
                int result = 0;

                switch(operator){
                    case "+":
                    result = first + second;
                    break;
                    case "-":
                        result = second - first;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result =second / first ; 
                        break;
                    default:
                        System.out.println("Invalid operator!");
                        break;
                }
                stack.push(String.valueOf(result));
            }
        }
        return Integer.valueOf(stack.pop());
    }
}
