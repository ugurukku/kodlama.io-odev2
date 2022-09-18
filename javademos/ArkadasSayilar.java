package javademos;

public class ArkadasSayilar {
	
	public static void main(String[] args) {
		int numbera = 284;
		int numberb = 220;
		
		int resulta = 0;
		int resultb = 0;
		
		for(int i = 1;i < numbera;i++) {
			if(numbera % i == 0) {
				resulta = resulta+i;
			}
		}
		for(int i = 1;i < numberb;i++) {
			if(numberb % i == 0) {
				resultb = resultb+i;
			}
		}
		
		if(resultb == numbera && resulta == numberb) {
			System.out.println(numbera+" ve "+numberb+" "+"arkadas sayilardir");
		}else {
			
		}
		
	}

}
