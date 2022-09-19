class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
         PriorityQueue<int[]> pq = new PriorityQueue<> (k, (arr1, arr2) -> {
			return arr1[0] - arr2[0];
		});
		for ( int i = 0; i < nums.length; i++ ) {
			int[] a = {nums[i], i};
			if ( pq.size() < k ) {
				pq.offer(a);
			} else if ( nums[i] > pq.peek()[0] ) {
				pq.poll();
				pq.offer(a);
			}
		}
		PriorityQueue<Integer> pq2 = new PriorityQueue<> (k);
		while ( !pq.isEmpty() ) {
			pq2.offer(pq.poll()[1]);
		}
		int[] res = new int[k];
		int count = 0;
		while ( !pq2.isEmpty() ) {
			res[count++] = nums[pq2.poll()];
		}
		
		return res;
    }
}   
//==>Time complexityO(logn)
//==>space complexity o()