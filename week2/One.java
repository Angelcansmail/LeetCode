package week2;

import java.util.Arrays;
import java.util.HashMap;
/*The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2 */

public class One {
	public static int[] twoSum(int[] nums, int target) {
		int[] numbers = new int[2];
		if (nums == null || nums.length < 2)
			return numbers;
		int sum = 0;
		for (int i = 0, j = i + 1; i < nums.length - 1 && j < nums.length; j++) {
			sum = nums[i] + nums[j];
			if (sum == target) {
				numbers[0] = i + 1;
				numbers[1] = j + 1;
				break;
			}
			if (j == nums.length - 1) {
				i++;
				j = i;
			}
			sum = 0;
		}
		//Hashmap
		/*int numbers[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(target - nums[i])) {
				map.put(nums[i], i);
			}else {
				numbers[0] = map.get(target - nums[i]) + 1;
				numbers[1] = i+1;
				break;
			}
		}*/

		// copy original list and sort
		/*int[] copylist = new int[nums.length];
		System.arraycopy(nums, 0, copylist, 0, nums.length);
		Arrays.sort(copylist);

		int low = 0;
		int high = copylist.length - 1;

		while (low < high) {
			if (copylist[low] + copylist[high] < target)
				low++;
			else if (copylist[low] + copylist[high] > target)
				high--;
			else {
				numbers[0] = copylist[low];
				numbers[1] = copylist[high];
				break;
			}
		}

		// find index from original list
		int index1 = -1, index2 = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == numbers[0] && index1 == -1)
				index1 = i + 1;
			else if (nums[i] == numbers[1] && index2 == -1)
				index2 = i + 1;
		}
		numbers[0] = index1;
		numbers[1] = index2;
		Arrays.sort(nums);*/

		return numbers;
	}
}