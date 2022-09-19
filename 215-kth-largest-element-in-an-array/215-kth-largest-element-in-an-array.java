class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i<nums.length; i++) {
            if(i < k) {
                pq.add(nums[i]);
            }
            else {
                if(pq.peek() < nums[i]) {
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
        }
        
        return pq.peek();
    }
}       

//==> Time complexity o(nlogk)
//==> space complexity o(logk)