class Solution {

 public String encode(List<String> strs) {
 if(strs.isEmpty()) {
            return null;
        }
        StringBuilder sb  = new StringBuilder();

        for(String st : strs) {
           sb.append(st.length());
           sb.append(",");
                    }
        sb.append("#");
        for(String st : strs) {
            sb.append(st);
        }

        return  sb.toString();
    }

    public List<String> decode(String str) {
        if(str == null || str == "" || str.length() == 0 || str.equals("**")) {
          ArrayList al = new ArrayList();
         
          return  al;
        }


        List<String> decoded = new ArrayList<>();


       String[] parts = str.split("#",2);
       String data =  parts[1].length() >0 ? parts[1] : "";

       int index = 0;
       for(String size : parts[0].split(",")) {

           decoded.add(data.substring(index,index+Integer.parseInt(size)));
           index = index+Integer.parseInt(size);

       }


        return  decoded;
    }
}
