package javademos;

public class MukemmelSayi {

	public static void main(String[] args) {
		int number = 5;
		int result = 0;
		for(int i = 1; i <= number/2;i++ ) {
		
			if(number % i == 0) {
				result = result +i;
			}
			
		}
		if(result == number) {
			System.out.println(number + " mukemmel bir sayidir");
		}else {
			System.out.println(number + " mukemmel bir sayi degildir");
		}

	}

}
