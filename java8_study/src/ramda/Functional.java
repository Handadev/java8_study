package ramda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Function<T, R> {
	R apply(T t);
}
// Function<T, R> �������̽��� ���׸� T�� �μ��� �޾� ���׸� R�� �����ϴ� �߻� �޼ҵ� apply�� �����Ѵ�
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
