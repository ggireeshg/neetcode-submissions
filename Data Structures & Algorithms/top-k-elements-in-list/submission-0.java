class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Integer> count = new HashMap<>();
        for(int num: nums)
            count.put(num, count.getOrDefault(num, 0)+1);
        ArrayList<int[]> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : count.entrySet())
            list.add(new int[] {entry.getValue(), entry.getKey()});

        list.sort((a,b)-> b[0]-a[0]);

        int[] result = new int[k];

        for(int i=k-1; i>=0; i--) {
            result[i] = list.get(i)[1];
        }

        return result;
    }
}
