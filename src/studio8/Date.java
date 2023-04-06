package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private String month;
	private int day;
	private int year;
	private boolean holiday;

	public static void main(String[] args) {
		Date x= new Date("January", 27, 2003, false);
		Date y = new Date("February", 20, 2005, true);
		Date z = new Date("May", 25, 2004, true);
		Date a = new Date("April", 15, 2001, false);
		Date b = new Date("December", 25, 2000, true);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(x);
		list.add(y);
		list.add(z);
		list.add(a);
		list.add(b);
		list.add(y);
		System.out.println(list);

		HashSet<Date> set = new HashSet<Date>();
		set.add(x);
		set.add(y);
		set.add(z);
		set.add(a);
		set.add(b);
		set.add(y);
		System.out.println(set);
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && Objects.equals(month, other.month);
	}
	public Date (String m, int d, int y, boolean h) {
		month = m;
		day = d;
		year = y;
		holiday = h;
	}
	public String toString() {
		return month + " " + day + " " + year + " " + holiday;

	}
}

