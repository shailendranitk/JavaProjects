package com.koderunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeExample {

	
	public static void main(String[] args) {
		LocalDate todaysDate = LocalDate.now();
		
		System.out.println("Todays date is :"+todaysDate);
		
		LocalDateTime todaysTime = LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("UTC")));
		
		System.out.println("Current Time :"+todaysTime);
		
		System.out.println("Current time of London:"+todaysTime);
		
		
		
		
	}
	
	
}
