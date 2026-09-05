class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prod = 1;
        int zeroCount = 0;


        for(int num: nums) {
            if(num == 0) {
                zeroCount++;
                continue;
            }
            prod *=num;
        }

        if(zeroCount > 1 ){
            return result;
        }
        else  {
            for(int i =0; i<nums.length;i++) {

                if(zeroCount > 0) {
                    result[i] = nums[i] ==0 ?prod : 0;
                } else
                    result[i] = prod/nums[i];

            }
        }



    return result;
    }
}  
