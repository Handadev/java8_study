package ramda;

import java.util.function.IntBinaryOperator;

public class MethodRefereces {
	/*  
	 *  �޼ҵ� ������ �޼ҵ带 �����ؼ� �Ű� ������ ���� �� ���� Ÿ���� �˾Ƴ���,
	 *  ���ٽĿ��� ���ʿ��� �Ű� ������ �����ϴ� ���� ����
	 *  ���� �޼ҵ�� �ν��Ͻ� �޼ҵ� ����
	 *  ����(static) �޼ҵ�� Ŭ���� :: �޼ҵ�
	 *  �ν��ͽ� �޼ҵ�� �������� :: �޼ҵ�
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
