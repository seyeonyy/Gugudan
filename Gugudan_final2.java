import java.util.Scanner;
public class Gugudan_final2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dan1 = input.nextInt();
		int dan2 = input.nextInt();
		for(int j = 2; j<= dan1; j++) {
			for(int i = 1; i <= dan2; i++) {
				int result = j * i;
				System.out.println(j+"x"+i+"="+result);
			}
		}
		input.close();
	}
}
