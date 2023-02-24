//1.Реализовать алгоритм сортировки слиянием

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Program{
	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();
		matrix.add(Arrays.asList(5, 4, 3, 2, 1));
		matrix.add(Arrays.asList(10, 7, 9, 8, 6 ));
        System.out.println("Первый массив: " + matrix.get(0));
        System.out.println("Второй массив: " + matrix.get(1));
        Collections.sort(matrix.get(0));
        System.out.println("Первый отсортированный массив: " +matrix.get(0));
        Collections.sort(matrix.get(1));
        System.out.println("Второй отсортированный массив: " +matrix.get(1));
        System.out.print("Полностью отсортированный список: ");
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
        }   
	}  
}
 
