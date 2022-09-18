package javademos;

public class SayiBulma {
	
	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 4;
		
		boolean isPresent = false;
		
		for(int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == aranacak) {
				isPresent = true;
			}
		}
		
		if(isPresent) {
			System.out.println(aranacak + " sayisi dizimizde mevcuttur");
		}else {
			System.out.println(aranacak + " sayisi dizimizde mevcut degildir");
		}
 	}

}
