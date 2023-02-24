//3.Задан целочисленный список ArrayList. Найти минимальное, максимальное 
//и среднее арифметическое этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;

public class Program{
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(100);

		System.out.println("Минимальное значение: " + Collections.min(list));
		System.out.println("Максимальное значение: " + Collections.max(list));
		
		OptionalDouble average = list.stream().mapToInt(e -> e).average();
		if (average.isPresent())
		{
		    System.out.print("Среднее арифметическое: " + average.getAsDouble());
		}
	}	
}
