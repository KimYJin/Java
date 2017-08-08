package myPackage;

public class EncoderDemo {

	public static void main(String[] args) {
		 SubstitutionCipher cipher = new SubstitutionCipher(3);
	        System.out.println(cipher.encode("abcde"));

	        ShuffleCipher cipher2 = new ShuffleCipher(1);
	        System.out.println(cipher2.encode("abcdefghi"));
		

	}

}
