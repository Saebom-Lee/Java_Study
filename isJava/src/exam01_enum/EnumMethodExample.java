package exam01_enum;

import java.util.Iterator;

public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = Week.SUNDAY;
		
		String name  = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.THURSDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		if(args.length == 1) {
			// Run -> Run Configurations
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말입니다.");
			} else {
				System.out.println("평일입니다.");
			}
		}
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
