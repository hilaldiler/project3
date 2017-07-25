package tr.org.kamp.linux.arrays;

import java.util.Random;

public class ArraysDemo {
	private static Random rand = new Random();
	private static int bound = 10; // sınır

	private static int[] array = new int[bound];

	public static void main(String[] args) {
		generateArray(); // üretmek
		printArray();
		sortArray();
		System.out.println("\n Siralanmis dizi");
		int item = 5;
		printArray();

		System.out.println(searcItem(item));
		if (lastIndexOf(4) == -1) {
			System.out.println("Value is not Found");
		}
		System.out.println("Value is Found.");
	}

	public static void generateArray() { // random ile Array olusturuyor
		int item;
		for (int i = 0; i < array.length; i++) {
			item = rand.nextInt(10);// 0-9 arası deger//
			array[i] = item;

		}

	}

	public static void printArray() {// ekrana basar
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void sortArray() {// Kücükten büyüğe sıralıyor.
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++)// Bir sonraki indisi karsılastırmak icin 1 den basladı//
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;

				}
		}
	}

	public static int lastIndexOf(int item) { // istenilen değerin sondaki indeksi
		for (int i = (array.length - 1); i >= 0; i--) {
			if (array[i] == item) {
				return i;
			}
		}
		return -1;
	}

	private static boolean searcItem(int item) { // Aranılan deger var mıyok mu
		for (int i = 0; i < array.length; i++) {
			if (array[i] == item) {
				return true;
			}
		}
		return false;
	}

}
