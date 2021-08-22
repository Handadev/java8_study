package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx03 {
	
	public static void main(String[] args) {
		/*
		 *  ���ڿ� �迭���� ���ڸ� �ϳ��ϳ� �̾Ƽ� ��ġ�� �� ���� ����ϱ�
		 *  ��Ʈ���� ���ȭ
		 *  .map(word -> word.split(""))
		 *  .distinct() 
		 *  ...
		 *  �̷� �������� �����ϸ� Stream<String[]> ���� ������ ��
		 *  ���� ���ϴ� ������ Stream<String>
		 *  
		 *  Arrays.stream()�̶�� �迭�� �����ϴ� ����� ���� 
		 *  .map(Arrays :: stream)
		 *  �̰� ����ϸ� List<Stream<String>> �̷��� ���� ��
		 *  
		 *  �̶� ����� �� �ִ� ���� 'flatMap'
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
