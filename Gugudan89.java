import java.util.Scanner;
public class Gugudan89 {
	public static void main(String[] args) {
		int num8 = 0;
		int num9 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요? :");
		num8 = sc.nextInt();
		int i = 1;
		int result8 = 0;
		int result9 = 0;
		while(i < 10) {
			result8 = num8 * i;
			if(2<=num8 && num8<=9) {
				System.out.println(num8+"x"+i+"="+result8);
			}
			else {
				System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
				break;
			}
			i++;
		}
		System.out.println("몇 단을 출력할까요? :");
		num9 = sc.nextInt();
		int j = 1;
		while(j<10) {
			result9 = num9 * j;
			if(2<=num9 && num9<=9) {
				System.out.println(num9+"x"+j+"="+result9);
			}
			else {
				System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
			}
			j++;
		}
		sc.close();
	}

}
