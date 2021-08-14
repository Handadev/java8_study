package ramda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Predicate<T> {
	boolean test(T t);
}

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
		List<String> list = Arrays.asList("»ç°ú", "µþ±â");
		Predicate<String> noStringTest = (String s) -> !s.isEmpty();
		List<String> getString = filter(list, noStringTest);
	}
	/**
	 * 
	 */
}
