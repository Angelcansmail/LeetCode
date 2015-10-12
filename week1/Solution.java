public class Solution {
	public static void rotate(int[] nums, int k) {
		if (k >= nums.length) {
			k = (k - nums.length) % nums.length;
		}
		if (k == 0) {
			for (int i = 0; i < nums.length; i++)
				System.out.print(nums[i]);
		} else {
			int[] nums2 = new int[nums.length];
			// System.arraycopy(nums,nums2,k+1,k+1);
			if (k != nums.length) {
				for (int j = 0, i = nums.length - k; i < nums.length; i++) {
					nums2[j] = nums[i];
					System.out.print(nums2[j++]);
				}
				for (int i = 0; i < nums.length - k; i++) {
					nums2[k + i] = nums[i];
					System.out.print(nums2[k + i]);
				}
			}
		}
	}
    
/*		int[] nums2 = new int[nums.length];
		// System.arraycopy(nums,nums2,k+1,k+1);
		for (int j = 0, i = nums.length - k; i < nums.length; i++) {
			nums2[j] = nums[i];
			System.out.print(nums2[j++]);
		}
		for (int i = 0; i < nums.length - k; i++) {
			nums2[k + i] = nums[i];
			System.out.print(nums2[k+i]);
		}
	*/
	public static void main(String[] args) {
		int[] num = {1,2,3, 4, 5, 6, 7};
		Solution.rotate(num,16);
	}
}