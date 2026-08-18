class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[length];

        for(int i=length-1; i>=0; i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                stack.pop();
            }

            if(!stack.isEmpty())
                result[i] = stack.peek()-i;

            stack.push(i);
        }
        return result;
    }
}
