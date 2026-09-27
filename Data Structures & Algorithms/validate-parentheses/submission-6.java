class Solution {
    public boolean isValid(String s) {
         if(s.length()%2 !=0) return  false;
        Stack<Character> store = new Stack<>();
        for (char c:s.toCharArray()) {
            if(c == '(') {
                store.push(')');
            } else if (c == '{') {
                store.push('}');
            }else if (c == '[') {
                store.push(']');
            } else if(store.isEmpty() || store.pop() != c) {
                return  false;
            }
        }


        return  store.isEmpty();
    }
}
