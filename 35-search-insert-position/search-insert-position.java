class Solution {
    public int searchInsert(int[] nums, int target) {
        int start, last;
        start = 0;
        last = nums.length;


        while (start < last){
           int mid = start + (last- start) / 2;

           if (target> nums[mid]){
            start = mid + 1;
           }
           else {
            last = mid;
           }
        }
        return start;
    }
}