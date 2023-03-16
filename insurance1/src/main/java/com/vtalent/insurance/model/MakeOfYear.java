package com.vtalent.insurance.model;

public class MakeOfYear {

	private int id;
	private int year;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MakeOfYear(int id, int year) {
		this.id = id;
		this.year = year;
	}
	public MakeOfYear() {
	}

	
}


