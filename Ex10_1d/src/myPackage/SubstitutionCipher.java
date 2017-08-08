package myPackage;

public class SubstitutionCipher implements MessageEncoder{

	private int shift;
	
	public SubstitutionCipher(int shift){
		this.shift = shift;
	}
	@Override
	public String encode(String plainText){
		
		char plainChar[] = plainText.toCharArray();
		
		for(int i=0;i<plainText.length(); i++) {
			plainChar[i]+=shift;
		}
		
		return String.valueOf(plainChar);
	}
}
