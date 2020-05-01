/* The isBadVersion API is defined in the parent class VersionControl.

      boolean isBadVersion(int version); */

 

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {

        int low = 0;

        int hi = n;

        while(low < hi){

            int mid = low + (hi - low)/2;

            if(isBadVersion(mid)){

                hi = mid;

            }else{

                low = mid + 1;

            }

        }

        return low;

    }

}
	

