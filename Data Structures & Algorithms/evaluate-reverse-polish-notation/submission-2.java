class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        List<String> opeartors = List.of("+", "-", "*","/");
        Stack<Integer> operands = new Stack<>();
        for (String str: tokens) {
            if(opeartors.contains(str)){
                   int right = operands.pop();
                   int left = operands.pop();
                switch (str) {
                    case ("+"):
                        result = left + right;
                        break;
                    case ("*"):
                        result = left * right;
                        break;
                    case ("-"):
                        result = left - right;
                        break;
                    case ("/"):
                        result = left / right;
                        break;
                }
                operands.push(result);

            } else {
                operands.push(Integer.valueOf(str));
            }
        }


        return !operands.isEmpty() ? operands.pop() : result;
    }
}
