package tr.org.kamp.linux.arrays;

public class Hobbits {
	String name;

	public static void main(String[] args) {
		Hobbits[] hobbits = new Hobbits[3];
		int z=0;
		while(z<3) {
			hobbits[z]=new Hobbits();
			hobbits[z].name="Frodo";
			if(z==1) {
				hobbits[z].name="Bilbo";
				
			}
			if(z==2) {
				hobbits[z].name="Sam";
			}
			System.out.println(hobbits[z].name+"Mordor'a ilerliyor.");
			
		}

	}
}
