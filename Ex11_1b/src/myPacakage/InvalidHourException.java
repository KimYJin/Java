package myPacakage;

public class InvalidHourException {
	
	public static boolean checkTime(String t)throws InvalidTimeException{ //t="hh:mm xx"
		try{
			
			String hh= t.substring(0,2);
			
			int h=Integer.parseInt(hh);

			if(h<0 || h>12)
				throw new InvalidTimeException("Exception: wrong hour value!");

		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("Enter the right hour value");
			return false;
		}
		return true;

		
	}
}
