package com.vtalent.insurance.model;

public class CarModel {

	private int Id;
	private int yearid;
	private int makeid;
	private String modelName;
	
	
	public int getYearid() {
		return yearid;
	}
	public void setYearid(int yearid) {
		this.yearid = yearid;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getMakeid() {
		return makeid;
	}
	public void setMakeid(int makeid) {
		this.makeid = makeid;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	
	public CarModel(int id, int yearid, int makeid, String modelName) {
		Id = id;
		this.yearid = yearid;
		this.makeid = makeid;
		this.modelName = modelName;
	}
	public CarModel() {
	}
	
	
	
		
		


}
