class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        HashSet<String> set = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

        for(String token : tokens){
            if(set.contains(token)){
                int secondElement = stack.pop();
                int firstElement = stack.pop();

                if(token.equals("+"))
                    stack.push(firstElement + secondElement);
                else if(token.equals("-"))
                    stack.push(firstElement - secondElement);
                else if(token.equals("*"))
                    stack.push(firstElement * secondElement);
                else
                    stack.push(firstElement / secondElement | 0);

            }else{
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.peek();
    }
}
