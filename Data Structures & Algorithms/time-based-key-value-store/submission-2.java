class TimeMap {

    static class Entry {
            int timestamp;
            String value;

            Entry(int timestamp, String value) {
                this.timestamp = timestamp;
                this.value = value;
            }
        }
    
   private Map<String, List<Entry>> map = new HashMap<>();

    public TimeMap() {
       map = new HashMap<>();
    }

 

       
        

        public void set(String key, String value, int timestamp) {
            map.putIfAbsent(key, new ArrayList<>());

            // Store the actual timestamp and String value
            map.get(key).add(new Entry(timestamp, value));
        }

        public String get(String key, int timestamp) {
            List<Entry> list = map.get(key);

            if (list == null) {
                return "";
            }

            int left = 0;
            int right = list.size() - 1;
            int answer = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (list.get(mid).timestamp <= timestamp) {
                    answer = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return answer == -1 ? "" : list.get(answer).value;
    }
}
