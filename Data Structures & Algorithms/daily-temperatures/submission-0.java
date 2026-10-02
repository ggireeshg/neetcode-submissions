class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i+1,k=0; j < temperatures.length; j++) {
                k++;
                if(temperatures[j] > temperatures[i]) {

                    result[i] = k;
                    break;
                }
            }
        }

        return result;
    }
}
