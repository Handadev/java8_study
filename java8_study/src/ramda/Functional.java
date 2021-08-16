package ramda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Function<T, R> {
	R apply(T t);
}
// Function<T, R> 인터페이스는 제네릭 T를 인수로 받아 제네릭 R를 리턴하는 추상 메소드 apply를 정의한다
public class Functional {
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
		List<R> result = new ArrayList<>();
		for (T t : list) {
			result.add(f.apply(t));
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<Integer> list = map(
								Arrays.asList("lamda", "in", "action"),
								(String s) -> s.length()
								);
		for (Integer i : list) {
			System.out.println(i);
		}
	}
}
