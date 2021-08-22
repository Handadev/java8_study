package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx01 {
	
	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fires", false, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("salmon", false, 450, Dish.Type.FISH)
				);
		
		List<String> threeHighCaloricDishName =
				menu.stream()
					.filter(dish -> dish.getCalories() > 350)
					.map(Dish :: getName)
					.limit(3)
					.collect(Collectors.toList());
		System.out.println(threeHighCaloricDishName);
	}
}
