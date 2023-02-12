import java.util.Scanner;
public class Gugudan_array {
	public static void main(String[] args) {
		int gugudan[] = new int[10];
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요? :");
		num = sc.nextInt();
		for (int i = 1; i<gugudan.length; i++) {
			gugudan[i] = num * i;
			System.out.println(num+"x"+i+"="+gugudan[i]);
		}
		sc.close();
	}

}
