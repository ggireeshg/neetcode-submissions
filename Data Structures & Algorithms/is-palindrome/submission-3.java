class Solution {
    public boolean isPalindrome(String s) {
           s = s.toLowerCase();
//        s =s.replaceAll("[^a-z0-9]","");
        int left = 0, right = s.length()-1;

        while(left < right) {

            while(left < right && !isalphabate(s.charAt(left))) {
               left++;
            }
            while(left < right && !isalphabate(s.charAt(right))) {
                right--;
            }
                if (s.charAt(left) != s.charAt(right)) {

                    return false;
                }
            left++;
            right--;
            }
        return  true;
       
       
    }
   static boolean isalphabate(char ch) {
        if((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9') )
            return true;

        return false;
    }

}
