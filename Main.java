/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя. */

import java.sql.Array;

public class Main {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50, 60};
		int[] arr2 = {1, 2, 3, 4, 5, 8, 11};
		if(checkDiff(arr1, arr2))
			System.out.println("Массивы не одинаковы");
		for(int item: diffArray(arr1, arr2))
			System.out.println(item);
	}

	public static boolean checkDiff(int[] arr1, int[] arr2) {
		return arr1.length != arr2.length;
	}

	public static int [] diffArray(int[] arr1, int[]arr2) {
		int lenght = 0;
		if (arr1.length <= arr2.length)
			lenght = arr1.length;
		else
			lenght = arr2.length;

		int[] temp = new int[lenght];
		for (int i = 0; i < lenght; i++)
			temp[i] = arr1[i] - arr2[i];
		return temp;
	}
}
