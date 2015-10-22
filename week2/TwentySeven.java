package week2;
/*
Given an array and a value, remove all instances of that value in place and return the new length.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
*/
public class TwentySeven {
	public static int removeElement(int[] nums, int val) {
		int count = 0, flag = 0;
		int len = nums.length;
		int i = 0, j = 0;
		while (len - flag > 0) {
			j = i;
			if (nums[j] == val) {
				count++;
				for (; j < len - count; j++)
					nums[j] = nums[j + 1];
			} else {
				i++;
			}
			flag++;
		}
		return len - count;
	}
}
