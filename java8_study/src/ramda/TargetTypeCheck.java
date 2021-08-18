package ramda;

import java.util.ArrayList;
import java.util.List;

enum Color {
	RED, GREEN
}

class Apple {
	private int weight;
	private Color color;
	
	public Apple(int weight, Color color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}

}

public class TargetTypeCheck {
	/*
	 *  � ���ؽ�Ʈ(���ٰ� ���޵� �޼ҵ� �Ķ���ͳ�/ �Ҵ�Ǵ� ����)���� ���Ǵ� ���� ǥ���� ������ "�������"�̶�� ��
	 */
	private static <T> List<T> filter(List<T> inventory, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T t : inventory) {
			if(p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		/* ���� ������
		 * 1- filter �޼ҵ��� ���� Ȯ��
		 * 2- filter �޼ҵ�� �� ��° �Ķ���ͷ� Predicate<> ��������� �����
		 * 3- Predicate<>�� test��� �ϳ��� �߻� �޼ҵ带 �����ϴ� �Լ��� �������̽�
		 * 4- test �޼ҵ�� ��������� Apple�� �޾� boolean�� ��ȯ�ϰ� �ȴ�
		 */
		
		/*
		 * 1- ������ ���Ǹ� Ȯ���ϰ�
		 * 2- ��������� Apple�ΰ� Ȯ���� �Ǹ� Predicate<T>�� <Apple>�� ��ġ�ȴ�
		 * 3- Predicat�� �߻� �޼ҵ�� test�� ���� T ��� Apple�� �޾� boolean���� ��ȯ�ϰ� �ȴ�
		 * 4- �������̽��� �Լ� ��ũ���ʹ� Apple -> boolean / ���ٵ� Apple�� �޾� boolean�� ��ȯ�ϹǷ�
		 *    ���İ˻�� ���������� �Ϸ�ȴ�
		 */
		List<Apple> inventory = new ArrayList<Apple>();
		inventory.add(new Apple(160, Color.GREEN));
		inventory.add(new Apple(140, Color.GREEN));
		List<Apple> morethan150 = filter(inventory, (Apple apple) -> apple.getWeight() > 150);
		
		for (Apple i : morethan150) {
			System.out.println(i);
		}
	}
}
