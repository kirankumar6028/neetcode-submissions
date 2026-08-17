class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || 
            s.charAt(i) == '[' ||
            s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.size() == 0)
                    return false;
                else{
                    if(s.charAt(i) == ')' && stack.peek().equals('(') || 
                    s.charAt(i) == ']' && stack.peek().equals('[') || 
                    s.charAt(i) == '}' && stack.peek().equals('{'))
                        stack.pop();
                    else
                        return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
