package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx02 {
	
	public static void main(String[] args) {
		/*
		 *  리스트에서 String 뽑아서 숫자 가져오기
		 */
		// 1
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fires", false, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("salmon", false, 450, Dish.Type.FISH)
				);
		
		List<Integer> nameLength = menu.stream()
									   .map(Dish :: getName)
									   .map(String :: length)
									   .collect(Collectors.toList());
		
		System.out.println(nameLength);
		// 2
		List<String> words = Arrays.asList("mordern", "java", "in", "action");
		List<Integer> wordsLength = words.stream()
										 .map(String :: length)
										 .collect(Collectors.toList());
		System.out.println(wordsLength);
		
	}
}
