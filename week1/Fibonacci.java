public class Fibonacci {
	static long Fibonacci2(int n) {
		int first = 1, second = 2;
		long result = 0;
		for (int i = n; i > 2; i--) {
			result = first + second;
			first = second;
			second = (int) result;
		}
		return result;
	}

	public static void main(String[] args) {
		long num = (long) Math.pow(2, 63);
		System.out.println(num);
		System.out.println(Fibonacci2(47));
	}
}
