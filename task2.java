//2.Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

import java.util.List;

public class Program{
    public static void main(String[] args) {
    	List<Integer> list = new ArrayList<>(List.of(1, 2, 5, 6, 3, 7));
        System.out.println(list);
        for (int i = 1; i < list.size()-1; i++) {
        	if(i % 2 != 0){
        }
        	list.remove(i);
        }

     
        for (Object item : list) { 
            System.out.print(item + " ");
        }
    }
	
}
