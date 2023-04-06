package studio8;

import java.util.HashSet;

public class Time {

	private int hour;
	private int minute;
	private boolean format;
	public Time(int h, int m, boolean f) {
		// TODO Auto-generated constructor stub
		hour = h;
		minute = m;
		format = f;
	}
	public static void main(String[] args) {
		Time x= new Time(2, 34, true);
		Time y = new Time(4, 50, true);
		Time z = new Time(8, 39, true);
		Time a = new Time(1, 10, false);
		Time b = new Time(3, 59, true);
		HashSet<Time> set = new HashSet<Time>();
		set.add(x);
		set.add(y);
		set.add(z);
		set.add(a);
		set.add(b);
		set.add(y);
		System.out.println(set);
	}
}

