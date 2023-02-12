import java.util.Scanner;
public class Gugudan_final{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		for(int j = 2; j<=dan; j++) {
			for(int i = 1; i<10; i++) {
				int result = j * i;
				System.out.println(result);
				if(i==dan) {
					break;
				}			}
		}
		sc.close();
		
	}
}