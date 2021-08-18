package ramda;

import java.util.ArrayList;
import java.util.List;

enum Color {
	RED, GREEN
}

class Apple {
	private int weight;
	private Color color;
	
	public Apple(int weight, Color color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}

}

public class TargetTypeCheck {
	/*
	 *  어떤 콘텍스트(람다가 전달될 메소드 파라미터나/ 할당되는 변수)에서 기대되는 람다 표현의 형식을 "대상형식"이라고 함
	 */
	private static <T> List<T> filter(List<T> inventory, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T t : inventory) {
			if(p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		/* 과정 진행방식
		 * 1- filter 메소드의 선언 확인
		 * 2- filter 메소드는 두 번째 파라미터로 Predicate<> 대상형식을 기대함
		 * 3- Predicate<>는 test라는 하나의 추상 메소드를 정의하는 함수형 인터페이스
		 * 4- test 메소드는 결과적으로 Apple을 받아 boolean을 반환하게 된다
		 */
		
		/*
		 * 1- 필터의 정의를 확인하고
		 * 2- 대상형식이 Apple인게 확인이 되면 Predicate<T>는 <Apple>로 대치된다
		 * 3- Predicat의 추상 메소드는 test로 이제 T 대신 Apple을 받아 boolean으로 반환하게 된다
		 * 4- 인터페이스의 함수 디스크립터는 Apple -> boolean / 람다도 Apple을 받아 boolean을 반환하므로
		 *    형식검사는 성공적으로 완료된다
		 */
		List<Apple> inventory = new ArrayList<Apple>();
		inventory.add(new Apple(160, Color.GREEN));
		inventory.add(new Apple(140, Color.GREEN));
		List<Apple> morethan150 = filter(inventory, (Apple apple) -> apple.getWeight() > 150);
		
		for (Apple i : morethan150) {
			System.out.println(i);
		}
	}
}
