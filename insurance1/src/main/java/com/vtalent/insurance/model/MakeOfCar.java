package com.vtalent.insurance.model;

public class MakeOfCar {

	private int Id;
	private int yearid;
	private String makeName;
	
	
	

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getYearid() {
		return yearid;
	}
	public void setYearid(int yearid) {
		this.yearid = yearid;
	}
	public String getMakeName() {
		return makeName;
	}
	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}
	
	public MakeOfCar(int id, int yearid, String makeName) {
		Id = id;
		this.yearid = yearid;
		this.makeName = makeName;
	}
	public MakeOfCar() {
	}
	
	
	

}


