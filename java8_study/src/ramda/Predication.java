package ramda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Predicate<T> {
	boolean test(T t);
}
// Predicate<T> 인터페이스는 제네릭 T를 인수로 받아 boolean을 반환하는 test 추상 메소드를 정의한다 
public class Predication {
	
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<T>();
		for (T t : list) {
			if(p.test(t)) {
				results.add(t);
			}
		}
		return results;
	}
	
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("사과", "딸기");
		Predicate<String> noStringTest = (String s) -> !s.isEmpty();
		List<String> getString = filter(list, noStringTest);
	}
	/**
	 * 
	 */
}
