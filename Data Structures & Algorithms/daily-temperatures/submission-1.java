class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                int indexOfElementtoberemoved = stack.pop();
                result[indexOfElementtoberemoved] = i- indexOfElementtoberemoved;
            }
            stack.push(i);
        }
        return result;
    }
}
