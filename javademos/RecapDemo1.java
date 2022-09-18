package javademos;

public class RecapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 30;

		if (sayi1 > sayi2) {

		
			if (sayi1 > sayi3) {
				System.out.println(sayi1);
			} else {
				System.out.println(sayi3);
			}
			

		} else if (sayi2 > sayi3) {
	
			System.out.println(sayi2);
		
		} else {
		
			System.out.println(sayi3);
		
		}

	}

}
