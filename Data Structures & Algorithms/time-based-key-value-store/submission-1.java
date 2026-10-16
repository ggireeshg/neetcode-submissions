class TimeMap {

   
    
     HashMap<String, Map<Integer, String>> keystore;
    public TimeMap() {
        keystore= new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        keystore.putIfAbsent(key, new HashMap<Integer, String>());
        keystore.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if(!keystore.containsKey(key)) {
            return  "";
        }
        if(keystore.get(key).containsKey(timestamp)) {
            return  keystore.get(key).get(timestamp);
        }

        int seen = -1;

        for (int time: keystore.get(key).keySet()) {

              if(time <= timestamp) {
                  seen = Math.max(seen, time);
              }
        }

         if (seen ==-1)
            return "";


        return keystore.get(key).get(seen);
    }
}
