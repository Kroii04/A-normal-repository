import java.time.*;
public class Calendar {
	public static void main(String[] args) {
		//The program diaplays the current time as a calendar
		//available year round
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int today = now.getDayOfMonth();
		now = now.minusDays(today-1);
		int weekOfNow = now.getDayOfWeek().getValue();
		System.out.println("        " + year + " " + month);
		System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
		for(int i=1;i<weekOfNow;i++) {
			System.out.print("    ");
		}
		while(now.getMonthValue() == month) {
			if(now.getDayOfMonth() == today)
				System.out.printf("*%3d",now.getDayOfMonth());
			else 
				System.out.printf("%4d",now.getDayOfMonth());
			now = now.plusDays(1);
			if(now.getDayOfWeek().getValue() == 1)
				System.out.println();
		}
	}
}