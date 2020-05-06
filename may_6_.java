class Solution {
    public int majorityElement(int[] nums) {
        int maxIndex = 0;
        int count = 1;
        for(int i = 1 ; i< nums.length;i++){
            if(nums[maxIndex]==nums[i]){
                count ++;
            }else{
                count --;
            }
            if(count == 0){
                count = 1;
                maxIndex = i; 
            }
        }
        return nums[maxIndex];
    }
}
