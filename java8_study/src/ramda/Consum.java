package ramda;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Consumer<T> {
	void accept(T t);
}
// Consumer<T> 인터페이스는 제네릭 T를 인수로 받아 void를 반환하는 추상 메소드 accept를 정의한다
public class Consum {
	
	public static <T> void foreach(List<T> list, Consumer<T> c) {
		for (T t : list) {
			c.accept(t);
		}
	}
	
	public static void main(String[] args) {
		foreach(
				Arrays.asList(1,2,3,4,5),
				(Integer i) -> System.out.println(i)
				);
		/**
		 * consumer의 accept메소드를 구현하는 람다식
		 */
		
	}
}
