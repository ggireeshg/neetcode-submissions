class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<Character> set = new ArrayList<>();
        char[] ch = s1.toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);
        String subString = "";
        for(int i =0 ;i <=s2.length()-s1.length(); i++) {

                subString = s2.substring(i,i+s1.length());
                ch = subString.toCharArray();
                Arrays.sort(ch);
                subString =  new String(ch);
                if(subString.equals(s)) {
                    return true;
                }


        }
        return  false;
    }
}

