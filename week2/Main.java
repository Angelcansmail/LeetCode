package week2;

public class Main {
	public static void main(String[] args) {
		//1,返回两个数和为target的下标
		int nums[] = { 2, 6, 3, 2, 3};
		int[] nums2 = One.twoSum(nums, 5);
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i]);
		}
		//7数的逆置
		System.out.println(Seven.reverse(1234568999));
		//27 排除目标数，返回新长度
		System.out.println(TwentySeven.removeElement(nums,5));
		//104树的最长路径
		//TreeNode tree = new TreeNode(x);
		//System.out.println(OneHundredandSeven.maxDepth(tree));
		//125回文
		System.out.println(OneHundredandTwentyfive.isPalindrome("ab"));
		//136寻找单独的一个数-6
		System.out.println(OneHundredandThirtySix.singleNumber(nums));
	}
}
