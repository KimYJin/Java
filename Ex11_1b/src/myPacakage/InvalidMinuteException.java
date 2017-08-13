package myPacakage;

public class InvalidMinuteException {
	
	public static boolean checkTime(String t)throws InvalidTimeException{
	try{
		
		String mm= t.substring(3,5);
		
		int m=Integer.parseInt(mm);


		if(m<0 || m>59){
			throw new InvalidTimeException("Exception: wrong minute value!");			
		}
	}
	
	catch(Exception e){
		System.out.println(e.getMessage());
		System.out.println("Enter the right minute value");
		return false;
	}
	return true;
  }
}
