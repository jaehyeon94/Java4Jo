package Test_20210127;

import java.time.LocalDate;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LocalDate now = LocalDate.now();
		LocalDate someDay;
		for(int i = 1; i < 13; i++) {
		someDay = LocalDate.of(2021, i, 5);
		PrintCal cal = new PrintCal(someDay.getDayOfWeek().getValue(),someDay.getYear(),someDay.getMonthValue(),
				someDay.getDayOfMonth(),someDay.lengthOfMonth());
		cal.Calendar();
		}
	}
}
