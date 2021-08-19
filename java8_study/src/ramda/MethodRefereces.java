package ramda;

import java.util.function.IntBinaryOperator;

public class MethodRefereces {
	/*  
	 *  메소드 참조는 메소드를 참조해서 매개 변수의 정보 및 리턴 타입을 알아내서,
	 *  람다식에서 불필요한 매개 변수를 제거하는 것이 목적
	 *  정적 메소드와 인스턴스 메소드 참조
	 *  정적(static) 메소드는 클래스 :: 메소드
	 *  인스터스 메소드는 참조변수 :: 메소드
	 */
	
	public static int staticMethod(int x, int y) {
		return x + y;
	}
	
	public int instanceMethod(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x, y) -> MethodRefereces.staticMethod(x, y);
		System.out.println(operator.applyAsInt(1, 2));
		
		operator = MethodRefereces :: staticMethod;
		System.out.println(operator.applyAsInt(3, 4));
		
		MethodRefereces mr = new MethodRefereces();
		
		operator = (x, y) -> mr.instanceMethod(x, y);
		System.out.println(operator.applyAsInt(1, 2));
		
		operator = mr :: instanceMethod;
		System.out.println(operator.applyAsInt(3, 4));
	}
}
