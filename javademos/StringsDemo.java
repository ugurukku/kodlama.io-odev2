package javademos;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		System.out.println(mesaj);

//		System.out.println("Eleman sayisi : " + mesaj.length());
//		System.out.println("5ci eleman : " + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yasasin!"));
//		System.out.println(mesaj.endsWith("."));
//		System.out.println(mesaj.startsWith("B"));
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf("av"));
//		System.out.println(mesaj.lastIndexOf("a"));

		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2, 5));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}

}
