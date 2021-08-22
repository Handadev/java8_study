package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx03 {
	
	public static void main(String[] args) {
		/*
		 *  문자열 배열에서 문자를 하나하나 뽑아서 겹치는 것 없이 출력하기
		 *  스트림의 평면화
		 *  .map(word -> word.split(""))
		 *  .distinct() 
		 *  ...
		 *  이런 형식으로 진행하면 Stream<String[]> 으로 리턴이 됨
		 *  내가 원하는 형식은 Stream<String>
		 *  
		 *  Arrays.stream()이라는 배열을 형성하는 기능이 있음 
		 *  .map(Arrays :: stream)
		 *  이걸 사용하면 List<Stream<String>> 이렇게 리턴 됨
		 *  
		 *  이때 사용할 수 있는 것은 'flatMap'
		 */
		
		List<String> words = Arrays.asList("Hello", "World");
		
		List<String> alpabet = words.stream()
									.map(word -> word.split(""))
									.flatMap(Arrays::stream)
									.distinct()
									.collect(Collectors.toList());
		
		System.out.println(alpabet);
	}

}
