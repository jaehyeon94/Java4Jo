package Test_20210127;

public class PrintCal {
	private int firstWeek;
	private int nowWeek;
	private int year;
	private int month;
	private int day;
	private int lastDay;

	public PrintCal() {
	}

	public PrintCal(int nowWeek, int year, int month, int day, int lastDay) {
		this.nowWeek = nowWeek;
		this.year = year;
		this.month = month;
		this.day = day;
		this.lastDay = lastDay;

		while (day != 1) {
			if (nowWeek > 1) {
				nowWeek--;
			} else if (nowWeek == 1) {
				nowWeek = 7;
			}
			day--;
		}
		this.firstWeek = nowWeek;
	}

	public int getNowWeek() {
		return nowWeek;
	}

	public void setNowWeek(int nowWeek) {
		this.nowWeek = nowWeek;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getLastDay() {
		return lastDay;
	}

	public void setLastDay(int lastDay) {
		this.lastDay = lastDay;
	}

	public void Calendar() {
		int number = 0;
		int weekCk = 0;
		System.out.println("                 " + year + "³âµµ");
		System.out.println("                   " + month + "¿ù");
		System.out.println("----------------------------------------");
		System.out.println(" Sun | Mon | Tue | Wed | Thu | Fri | Sat ");
		while (number < lastDay) {
			if (number == 0 && firstWeek != 0) {
				if(firstWeek == 7) {
					firstWeek = weekCk;
					number++;
				} else {
					System.out.print("      ");
					firstWeek--;
					weekCk++;
					if(firstWeek == 0) {
						number++;
						firstWeek = weekCk;
					}
				}
			} else if (number != 0) {
				System.out.printf(" %02d   ", number++);
				if (firstWeek == 6) {
					System.out.println();
					firstWeek = 0;
				} else {
					firstWeek++;
				}
			}

			/*
			 * if (firstWeek != 7) { for (int j = 1; j <= firstWeek; j++) {
			 * System.out.print("      "); } } for (int z = 1; z <= 7 - firstWeek; z++) {
			 * System.out.printf(" %02d   ", ++number); if (number == lastDay) { break; } }
			 * if (firstWeek != 7) { System.out.println(); } firstWeek = 0;
			 */
		}
		System.out.println("\n----------------------------------------");
	}
}
