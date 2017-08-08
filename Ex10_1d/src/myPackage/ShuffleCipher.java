package myPackage;

public class ShuffleCipher implements MessageEncoder{

    private int times = 0;

    public ShuffleCipher(int n) {
        this.times = n;
    }

    @Override
    public String encode(String plainText) { 
    	String text=plainText;
        for (int i = 0; i < times; i ++) 
        	text = shuffle(text);
        
        return text;
    }

	
	public String shuffle(String plainText){
		
		int length = plainText.length();
		int mid = (length+1)/2;
		
		char[] result = new char[length];
		
		char arr[] = plainText.toCharArray();
		
		for(int i=0,j=0; i<mid; i++){
			result[j++] = arr[i];

			if ((i + mid) < arr.length)
				 result[j ++] = arr[i + mid];
		    else 
				break;
		}

		return String.valueOf(result);
		
	}
}
