package Demo.java;

public class Date {
	public static void main(String[] args) {

		org.apache.poi.hpsf.Date d=new org.apache.poi.hpsf.Date();
		String d1 = d.toString();
		String d2 = d1.replace(':', '-');
		System.out.println(d2);
	}
}

