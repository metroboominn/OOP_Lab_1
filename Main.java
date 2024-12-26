	import java.io.IOException;
	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Main
	{
		public static void main(String[] args)
		{
		int n = 0;
		while ( true ) 
		{
			System.out.println("Введите число строк");
			Scanner sc1 = new Scanner(System. in ); // создание сканера sc1
			try
			{
				n = sc1.nextInt(); // чтение из консоли, проверка на тип введенных данных (на целочисленность)
				break;
			}
			catch(InputMismatchException fg)
				{
				System.out.print("Вы ввели не число. " ); // если введенное значение не является числом
				}
		}



		String[] str = new String[n]; // создание массива строк
		Scanner sc2 = new Scanner(System.in); // создание сканера sc2
		for (int i = 0; i < n; i++)  
			{
			System. out.println( " Введите строку №" + (i+1));
			str[i] = sc2.nextLine(); // чтение ввода, запись строчки в массив
			}



		for ( int i = 0; i < str. length -1; i++) //начало сортировки массива строк по длине
			{
			for (int j = i+1; j < str.length; j++)
			{
				if (str[i].length()<str[j].length()) // сравнение соседних строчек
				{
					String temp = str[i]; // запись строчки в временную переменную
					str[i] = str[j]; // замена соседних строчек в массиве
					str[j] = temp; // возврат строчки из временной переменной
				}
			}
		} //конец сортировки массива строк по длине

		
		System.out.println("Самая короткая строчка:"); // вывод результатов
		System.out.print(str[n-1]); // вывод результатов
		System.out.println( " её длина = " + str[n-1].length()); // вывод результатов

		}
	}