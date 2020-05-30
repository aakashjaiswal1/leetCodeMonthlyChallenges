public class Solution {
        public int findMaxLength(int[] nums) {
            HashMap<Integer,Integer> hm = new HashMap<>();
            hm.put(0,-1);
            int zero = 0 , one = 0 , ans = 0;
            for (int i = 0;i<nums.length;i++){
                if (nums[i] == 0)zero++;
                else one++;
                if (!hm.containsKey(zero-one)) hm.put(zero-one,i);
                else ans = Math.max(ans,i  - hm.get(zero - one));
            }
            return ans;
        }
}
