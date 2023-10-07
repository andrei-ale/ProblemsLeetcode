package Pb_278_FirstBadVersion;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        int mid;
        while (first <= last){
            mid = first + ((last-first) / 2);
            if (isBadVersion(mid) == false){
                first = mid + 1;
            }
            else {
                last = mid - 1;
                if (isBadVersion(mid-1) == false){
                    return mid;
                }
            }
        }
        return 0;
    }
}
