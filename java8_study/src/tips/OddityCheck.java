package tips;

public class OddityCheck {
	
	public static boolean oddOrNot(int num) {
		return num % 2 == 1;
	}
	
	public static boolean bitddOrNot(int num) {
		return (num & 1) != 0;
	}
	
	public static void main(String[] args) {
		boolean tf = oddOrNot(2);
		System.out.println(tf);
		
		tf = bitddOrNot(2);
		System.out.println(tf);
	}
}
