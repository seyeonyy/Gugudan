public class Gugudan_array {
	public static void main(String[] args) {
		int[] gugudan = new int[9];
		for(int j = 2; j <= 9; j++) {
			System.out.println(j+"단");
			for(int i = 0; i<gugudan.length; i++ ) {
				gugudan[i] = j * (i+1);
				System.out.println(j+"x"+(i+1)+"="+gugudan[i]);
			}
			System.out.println();
		}
	}
}
