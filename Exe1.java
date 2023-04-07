/* Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? */

public class Exe1 {
	public static void main(String[] args) {
		String[][] arr = {{"1", "2"}, {"3","4"}}; //Массив квадратный

		for (String[] strings : arr) { //Заполняем
			for (String string : strings) {
				System.out.print(string + " ");
			}
		}
		if (exceptionNull(arr) != null) System.out.println(exceptionNull(arr)); //Проверяем на NULL значение в массиве
		if (exceptionQuad(arr) != null)	System.out.println(exceptionQuad(arr)); //Проверяем на квадратность массива
		if (!exceptionDigit(arr)) System.out.println(exceptionDigit(arr)); //Проверяем на цифры
	}


	//1
	public static String exceptionQuad(String[][] arr){
		int rows = arr.length;
		int columns = arr[0].length;
		if(rows != columns)return "Массив не квадратный";
		return null;
	}
	//2
	public static String exceptionNull(String[][] arr){
		for (String[] strings : arr) {
			for (String string : strings) {
				if (string == null) {
					return "В массиве присутствуют пустые значения";
				}
			}
		}
		return null;
	}

	//3
	private static boolean exceptionDigit(String[][] arr) throws NumberFormatException {
		try {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					Integer.parseInt(arr[i][j]);
					}
				}
				return true;
			}
			catch (NumberFormatException e) {
				return false;
			}
		}

		/* Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? */
		// 1 - Выход за пределы массива, массив не равный
		// 2 - вместо цифр буквы
		// 3 - Возврат значения не Integer

	public static int sum2d(String[][] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < 5; j++){
				int val = Integer.parseInt(arr[i][j]);
				sum += val;
			}
		}
		return sum;
	}
}


