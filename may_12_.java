class Solution {
    public int singleNonDuplicate(int[] arr) {
        int low = 0;
        int hi = arr.length-1;
        while(low < hi){
            int mid = low + (hi - low)/2;
            if(mid % 2 == 1){
                mid--;
            }
            if(arr[mid] != arr[mid+1]){
                hi = mid;
            }else{
                low = mid  + 2;
            }
        }
        return arr[low];
    }

}
