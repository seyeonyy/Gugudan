import java.util.Scanner;
public class Gugudan45 {
	public static void main(String[] args) {
		int num4 = 0;
		int num5 = 0;
		int result4 = 0;
		int result5 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("4단");
		num4 = sc.nextInt();
		for(int i = 1; i<10; i++) {
			result4 = num4 * i;
			System.out.println(num4+"x"+i+"="+result4);
		}
		System.out.print("5단");
		num5 = sc.nextInt();
		for(int j = 1; j < 10; j++) {
			result5 = num5 * j;
			System.out.println(num5+"x"+j+"="+result5);
		}
		sc.close();
	}
}
