package Application;

public class LoopNested2 {
	public static void main(String[] args) {
		// i want to print pattern
		// 54321
		// 54321
		// 54321
		// 54321

		
		LoopNested2 stars=new LoopNested2 ();
		stars.printStars();
		
	}

	void printStars() {

		for (int i = 1; i <= 4; i++) {

			for (int a = 5; a > 0; a--) {

				System.out.print(a);
			}
			System.out.println();
		}
	}

}
