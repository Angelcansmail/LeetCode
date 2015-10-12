package rotate;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10 - i; j++) {
				System.out.print("   ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j >= 10?" " + j:"  " + j);
			}
			for (int j = 2; j <= i ; j++) {
				System.out.print(j >= 10?" " + j:"  " + j);
			}
			System.out.println();
		}
/*		outer:
			for (int i = 1; i < 10; i++) {
				System.out.println("i:" + i);
				inner:
					for (int j = 1; j < 10; j++) {
						System.out.print("j:" + j + "\t");
						if (i * j > 50) {
							break inner;
						}
						
						System.out.println(i*j);
					}
			}*/
	}

}
