package tr.org.kamp.linux.arrays;
import java.util.*;
public class CompareArrays {
	public static void main(String[] args) {
		int[] intArray1= {4,8,15,16,23,46};
		int[] intArray2= {4,8,15,16,23,47};
		boolean result=Arrays.equals(intArray1,intArray2);
		System.out.println("Array'ler esit mi?\n"+result);

	}

}
