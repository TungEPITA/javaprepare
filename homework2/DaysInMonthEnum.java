package fr.epita.homework2;

public enum DaysInMonthEnum {
	
	JANUARY(1,31,"Jan"),
	FEBRUARY(2, 28,"Feb"),
	MARCH(3,31,"Mar"),
	APRIL(4,30,"Apr"),
	MAY(5,31,"May"),
	JUNE(6,30,"Jun"),
	JULY(7,31,"Jul"),
	AUGUST(8,31,"Aug"),
	SEPTEMBER(9,30,"Sep"),
	OCTOBER(10,31,"Oct"),
	NOVEMBER(11,30,"Nov"),
	DECEMBER(12,31,"Dec"),
	
	;
	
	private int index;
	private int numberOfDays;
	private String displayName;
	
	
	private DaysInMonthEnum(int indexInYear, int numberOfDays, String displayName) {
		this.index = indexInYear;
		this.numberOfDays = numberOfDays;
		this.displayName = displayName;
				
				
	}


	public int getIndex() {
		return index;
	}


	public int getNumberOfDays() {
		return numberOfDays;
	}


	public String getDisplayName() {
		return displayName;
	}
	
		

}
