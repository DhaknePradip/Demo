package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import demo.base;

public class class2 extends base{

	public static void selectDate (int days) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date currentDate = new Date();//date will be get in format like fri june 23 10:20:00 ist 2023
        String todayDate = formatter.format(currentDate);// we format the above date in MM/dd/yyyy like 06/23/2023
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, days);//add days 
        Date modifiedDate = cal.getTime();// we get date after adding days in format of Sat May 18 10:17:26 IST 2024
        String nextDate = formatter.format(modifiedDate); //we format above date into MM/dd/yyyy like 05/18/2024
        System.out.println(nextDate);
        
        //String date = nextDate.replace("/", "");
        //System.out.println(Integer.parseInt(date));
        
       /* DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date1 = LocalDate.parse(nextDate, inputFormatter);
        
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM dd EEE yyyy");
		String formattedDate = date1.format(outputFormatter);
		System.out.println(formattedDate);*/	
	}
	public static void main(String[] args) throws ParseException {
		class2.selectDate (330);
		class2.selectDate(-1);
	}
	
}
