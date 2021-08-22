package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StramEx04 {
	
	
	public static void main(String[] args) {
		/*
		 * [1,2,3,4,5] �� �������� stream�� ���ؼ� ����ϱ�
		 */
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Integer> toSquare = numbers.stream()
										.map(num -> num * num)
										.collect(Collectors.toList());
		System.out.println(toSquare);
		
		/*
		 * [1,2,3] [3,4] �� �迭�� �����ؼ� (1,3)(1,4)(2,3)...
		 * �̷��� ����ϱ�
		 */
		List<Integer> one = Arrays.asList(1,2,3);
		List<Integer> two = Arrays.asList(3,4);
		List<int[]> sum = one.stream()
								.flatMap(i -> two.stream()
											  .map(j -> new int[] {i, j})
								)
								.collect(Collectors.toList());
		for (int[] num : sum) {
			for (int i : num) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("---------------");
		/*
		 * �� �������� �� ���� ���� 3���� �������� �� ���
		 */
		List<int[]> threeUp = one.stream()
								 .flatMap(i -> two.stream()
										 		  .filter(j -> (i + j) % 3 == 0)
										 		  .map(j -> new int[] {i, j})
								 )
								 .collect(Collectors.toList());
		for (int[] num : threeUp) {
			for (int i : num) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
