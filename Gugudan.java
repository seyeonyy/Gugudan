
public class Gugudan {
	public static void main(String[] args) {
		int num2 = 2;
		int num3 = 3;
		int result2 = 0;
		int result3 = 0;
		System.out.println("2단");
		for(int i = 1; i< 10; i++) {
			result2 = num2 * i;
			System.out.println(num2+"x"+i+"="+result2);
		}
		System.out.println("3단");
		for(int j = 1; j< 10; j++) {
			result3 = num3 * j;
			System.out.printf(num3+"x"+j+"="+result3+"\n");
		}
	}
}
