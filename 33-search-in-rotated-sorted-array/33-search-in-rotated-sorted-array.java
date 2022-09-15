//3==> Search in Rotated Sorted Array


class Solution {
    public int search(int[] nums, int target) {
        
        int first = 0;
        int last = nums.length-1;
        
        
        
         while (first <= last) {
            int mid = first + (last - first) / 2;

            if (nums[mid] == target) return mid;
            
            if (nums[mid] >= nums[first]) {
                if (target >= nums[first] && target <= nums[mid])
                    last = mid - 1;
                else first = mid + 1;

            } else {

                if (target >= nums[mid] && target <= nums[last])
                    first = mid + 1;
                else last = mid - 1;
            }
        }

        return -1;
    }
}
 
//==>Time Complexity: O(log N)
//==>Space Complexity: O(1)    
    