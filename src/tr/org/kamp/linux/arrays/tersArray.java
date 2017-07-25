package tr.org.kamp.linux.arrays;

import java.util.*;

public class tersArray {
	public static Random rand = new Random();
	public static int[] Ary = new int[6];

	public static void main(String[] args) {
		arrayOlustur();
		printArray();
		System.out.println("\n*****");
		tersArray();
		printArray();

	}
	public static void arrayOlustur() {
		int item;
		for(int i=0;i<Ary.length;i++) {
			item=rand.nextInt(6);
			Ary[i]=item;
		}
	}
	

	public static void printArray() {// ekrana basar
		for (int i = 0; i < Ary.length; i++) {
			System.out.print(Ary[i] + " ");
		}

	}
	
	public static void tersArray() {
		
		int temp;
		for(int i=0;i<Ary.length/2;i++) {// ör:1 5 8 2 9 4 olsun 6 sayi oldugu icin 1-4 yer degisir
			temp=Ary[i];                 // 5-9 yer degir. 8-2 yer degisir.Toplamda 3 islem yapılır.
			Ary[i]=Ary[Ary.length-1-i];  // Yani Array in yarısı kadar..
			Ary[Ary.length-1-i]=temp;
		}
	}
	
	
}








/*public class ReverseArray {

public static void main(String[] args) {
	int[] intArray = {28,05,2013,1917,2014,2017,1923};
	
	System.out.println("Array: " + Arrays.toString(intArray));
	
	for(int i = 0; i < intArray.length / 2; i ++) {
		int x = intArray[i];
		intArray[i] = intArray[intArray.length -i -1];
		intArray[intArray.length -i -1] = x;
	}
	
	System.out.println("Ters array: " + Arrays.toString(intArray));
}

}*/
 