class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // Fix: Check if stack is empty BEFORE popping
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatching(top, ch)) return false;    
            }
        }
        
        return stack.isEmpty();  // Stack should be empty if valid
    }

    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
