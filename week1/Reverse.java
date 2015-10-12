
public class Reverse {
	//
	/*int flag = 0;
	int l1,l2;
	String resultString = "";*/
	public static void main(String[] args) {
		System.out.println(new Reverse().myAtoi("-2147483648"));
	}
	//String to Integer8
	public int myAtoi(String str) {
		str = str.trim();
		int flag = 0;
		String resultString = "";
		if (str.length() == 0 | str == null) {
			return 0;
		} else {
			for (int i = 0; i < str.length(); i++) {
				// Runtime Error Message:Line 15:
				// java.lang.NumberFormatException: For input string: "" Last
				// executed input:"+1"
				if (str.charAt(i) == '+' && flag == 1)
					return 0;
				else if(str.charAt(i) == '+') {
					flag = 1;
					continue;
				}
				if (str.charAt(i) == '-'){
					//判断该-是否为非法字符
					if (flag == 0) {
						{
							flag = 1;
							resultString +="-";
						}
					}else
						return 0;
				}else if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
					resultString += str.charAt(i);
				}else{
					break;
				}
			}
			
			//java.lang.NumberFormatException: For input string: "",可能为"---abc",应输出0
			//如果得到的字符串中没有数字，则为---仍然输出0
			if (resultString.equals("") || resultString.matches("[^0-9]*$") || resultString.equals("-")) {
				return 0;
			}else if(isJ(resultString)){
				return 0;
			}
			System.out.println(resultString);
			//java.lang.NumberFormatException: For input string: "9223372036854775809"对于超过int范围内的，仍输出int最大值
			//说明为负数
			if (resultString.charAt(0) == '-') {
				String s = resultString.substring(1, resultString.length());
				if (s.length() == 10) {
					if (Long.parseLong(s) >= Math.pow(2, 31)) {
						return (int) ((int) -1 * (Math.pow(2, 31)));
					}
				} else if (s.length() > 10) {
					return (int) ((int) -1 * Math.pow(2, 31));
				}
			}
			else if (resultString.length() > 10 || Long.parseLong(resultString) >= Math.pow(2, 31)){
				return (int) Math.pow(2, 31);
			}
			return Integer.parseInt(String.valueOf(resultString));
		}
	}
	private boolean isJ(String resultString) {
		int count = 0;
		for (int i = 0; i < resultString.length(); i++) {
			if (resultString.charAt(i) == '-') {
				count++;
			}
		}
		return count>1?true:false;
	}
//Reverse Words in a String151
/*	private void run() {
	String string = s.trim();//开始没加，导致空格问题
	if (string.length() == 0 || string.equals(" ")) {
		return string;
	}else {
		String[] str = string.split(" ");
		String reverse = "";
		for (int i = 0; i < str.length; i++) {
			if (!str[str.length - 1 - i].equals("")) //开始用这个判断的，错误判断字符串问题if (str[str.length - 1 - i] != "") 
				reverse += str[str.length - 1 - i] + " ";
		}
		return reverse.substring(0,reverse.length() - 1);
	}
}*/
	//lengthOfLastWorld58
/*	public int lengthOfLastWorld(String s) {
		String string = s.trim();
		if (string.length() < 1)
			return 0;
		else{
			//Matcher matcher = Pattern.compile(".*[a-zA-Z]+.*").matcher(string);
				String[] str = string.split(" ");
				return str[str.length - 1].length();
		}
	}*/
	//add-binary67
/*	private void run() {
		String aString = "1010";
		String bString = "1011";
		String resultString2 = "";
		int[] num1 = new int[aString.length()];//Integer.parseInt(aString);
		for (int i = 0; i < num1.length; i++) {
			num1[i] = aString.charAt(i) - 48;
		}
		int[] num2 = new int[bString.length()];//Integer.parseInt(bString);
		for (int i = 0; i < num2.length; i++) {
			num2[i] = bString.charAt(i) - 48;
		}
		l1 = num1.length - 1;
		l2 = num2.length - 1;
		int len = l1 < l2?l1:l2;
		while (len >= 0) {
			int temp = num1[l1] + num2[l2] + flag;
			if (temp > 1) {
				resultString += temp%2;
				flag = 1;
			}else {
				resultString += temp;
				flag = 0;	//开始未加，导致进位出错，有不连续部分可能多加了之前的一个进位
			}
			l1--;
			l2--;
			len = Math.min(l1, l2);
		}
		if (l1 >= 0)
			resultString = tranString(num1,l1);
		else if (l2>= 0)
			resultString = tranString(num2, l2);
		else if(flag == 1)
			resultString += "1";
		for (int i = resultString.length() - 1; i >= 0; i--) {
			resultString2 += resultString.charAt(i);
		}
		System.out.println(Integer.parseInt(resultString2));
	}
		private int isZero(int i) {
			return (int) (i == 2?0:1);
		}
		private String tranString(int[] num,int l){
		while (l >= 0) {
			if (isZero(num[l] + flag) == 0) {
				resultString += "0";
				l--;
			}else {
				resultString += num[l--] + flag;
				flag = 0;
			}
		}
		if (isZero(num[0] + flag) == 0){
			resultString +="1";
			flag = 0;
		}
		return resultString;
	}*/
	
}
