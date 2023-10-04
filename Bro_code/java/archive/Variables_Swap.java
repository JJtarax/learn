public class Variables_Swap {

	public static void main(String[] args) {

		String x = "water";
		String y = "Kool-Aid";
		String temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);

		System.out.println();

		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}
