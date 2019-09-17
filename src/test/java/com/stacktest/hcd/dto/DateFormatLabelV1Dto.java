package com.stacktest.hcd.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class DateFormatLabelV1Dto  {

	
	private String date;
	
	private String day;
	
	private String month;
	
	private String monthName;
	
	private String year;
	
	private String dayWeek;
	
	private String hour;
	
	private String hour24;
	
	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getDay() {
		return day;
	}



	public void setDay(String day) {
		this.day = day;
	}



	public String getMonth() {
		return month;
	}



	public void setMonth(String month) {
		this.month = month;
	}


	
	public String getMonthName() {
		return monthName;
	}



	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public String getDayWeek() {
		return dayWeek;
	}



	public void setDayWeek(String dayWeek) {
		this.dayWeek = dayWeek;
	}



	public String getHour() {
		return hour;
	}



	public void setHour(String hour) {
		this.hour = hour;
	}



	public String getHour24() {
		return hour24;
	}



	public void setHour24(String hour24) {
		this.hour24 = hour24;
	}



	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

	
}
