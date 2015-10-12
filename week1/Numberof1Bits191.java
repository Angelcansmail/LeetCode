import week2.Seven;

public class Numberof1Bits191 {
	// you need to treat n as an unsigned value
	public static int hammingWeight(int n) {
		int count=0;
		while(n != 0){
			n = n&(n-1);
			count++;
		}
		/*int count = 0;
		String num = Integer.toBinaryString(n);
		System.out.println(num);
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '1')
				count++;
		}*/
		return count;
	}
	public static void main(String[] args) {
		System.out.println(Numberof1Bits191.hammingWeight(10));
	}
}