package myPackage;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class BusinessTime {

	public static boolean func(int open_hour, int open_min, int close_hour, int close_min, int hour, int min) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("HH:mm",Locale.KOREA);
		
		Date open = f.parse(open_hour+":"+open_min);
		Date close = f.parse(close_hour+":"+close_min);
		Date cur = f.parse(hour+":"+min);
		
		long diff1 = (cur.getTime() - open.getTime())/60000;
		long diff2 = (close.getTime() - cur.getTime())/60000;
		
		if(diff1 < 0 || diff2 < 0)
			return false;
	
		return true;
	}
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		int open_hour = 9, open_min = 30;
		int close_hour = 18, close_min = 40;
		int hour=0, min=0;
		
		while (true) {
			
			//���� �ð� �Է� �ޱ�	
			System.out.println("���� �ð��� �Է��ϼ��� (ex.10:30)");
			String input = sc.next();
			System.out.println("\n******************************\n");
			
			//��,�� �и�
			StringTokenizer token = new StringTokenizer(input);
			hour = Integer.parseInt(token.nextToken(":"));
			min = Integer.parseInt(token.nextToken(":"));

			//�ùٸ� �Է°����� �˻�
			if (hour < 0 || hour > 24 || min < 0 || min >= 60) 
				System.out.println("�� �Է°��� �߸��ƽ��ϴ� (��:0~24)(��:0~59)\n");
			else 
				break;
		}

		//�Լ� ȣ��
		boolean answer = func(open_hour, open_min, close_hour, close_min, hour, min);
		
		//��� ���
		if (answer == false) 
			System.out.println("���� �ð��� �ƴմϴ�");
		else 
			System.out.println("���� ���Դϴ�");

		System.out.println("���� �ð�: "+open_hour+":"+open_min+" ~ "+close_hour+":"+close_min);
		System.out.println("\n******************************\n");
		
	}

}
