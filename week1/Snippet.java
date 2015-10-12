import java.util.ArrayList;

public class Snippet {
	public static ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (numRows <= 0)
			return res;
		ArrayList<Integer> pre = new ArrayList<Integer>();
		pre.add(1);
		res.add(pre);
		for (int i = 2; i <= numRows; i++) {
			ArrayList<Integer> cur = new ArrayList<Integer>();
			cur.add(1);
			for (int j = 0; j < pre.size() - 1; j++) {
				cur.add(pre.get(j) + pre.get(j + 1));
			}
			cur.add(1);
			res.add(cur);
			pre = cur;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(Snippet.atoi("+-12"));
	}

	public static int atoi(String x) {
			int flag = -1,pot = 0;
			int num = 0;
		
			if(x == null || x.length() == 0) return 0;
			
			for(int i = 0; i < x.length(); i++)
				if(x.charAt(i) == ' ') continue;
				else if(x.charAt(i) == '-' || x.charAt(i) == '+' || (x.charAt(i) <= '9' && x.charAt(i) >= '0'))
					{
					flag = i;
					break;
					}
					else break;
			if(flag == -1) return 0;
			
			if(x.charAt(flag) == '-') 
			{
				pot = -1;
				flag++;
			}
			else if(x.charAt(flag) == '+') 
				{
				pot = 1;
				flag++;
				}
			
			
			for(int i = flag; i < x.length(); i++)
			{
					
				    if(x.charAt(i) <= '9' && x.charAt(i) >= '0')   //charAt用于string中找i位置的元素
					{
				    	
						if(num < Integer.MAX_VALUE/10 ) num = num * 10 + x.charAt(i) - '0';
						else if(num > Integer.MAX_VALUE/10) 
						{
							if(pot == -1) return Integer.MIN_VALUE;		//Integer.MIN_VALUE和MAX在java.lang下有时不会自动识别，前加java.lang即可识别
							else return Integer.MAX_VALUE;
						}
						else if(num == Integer.MAX_VALUE/10)
						{
							if(pot != -1)
							{
								if(x.charAt(i) <= '7')
								{
									num = num * 10 + x.charAt(i) - '0';
									break;
								}
								else if(x.charAt(i) > '7')
									return Integer.MAX_VALUE;
							}
							else
							{
								if(x.charAt(i) < '8')
								{
									num = num * 10 + x.charAt(i) - '0';
									break;
								}
								else if(x.charAt(i) >= '8')
									return Integer.MIN_VALUE;
							}
						}
					}
				    else break;
				
			}
			if(pot == -1) return -num;
			else return num;
	}
}