public class Division2 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			System.out.println(100 / a);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println("Autsch! " + e.getMessage());
		}
	}
}