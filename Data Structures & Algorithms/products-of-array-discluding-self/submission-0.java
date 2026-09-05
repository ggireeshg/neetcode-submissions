class Solution {
    public int[] productExceptSelf(int[] nums) {
        {
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
        else if(zeroCount  == 1 ) {
            for(int i =0; i<nums.length;i++) {

                if(nums[i] == 0) {
                    result[i] = prod;
                } else
                result[i] =0;
            }
        }


        else {
            for(int i =0; i<nums.length;i++) {

                    result[i] = prod/nums[i];
            }
        }

    return result;
    }
    }
}  
