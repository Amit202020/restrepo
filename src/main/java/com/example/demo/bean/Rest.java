package com.example.demo.bean;

public class Rest {
	
	private int restId;
	private String  restName;
	private String restDesc;
	
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getRestDesc() {
		return restDesc;
	}
	public void setRestDesc(String restDesc) {
		this.restDesc = restDesc;
	}
	public Rest(int restId, String restName, String restDesc) {
		super();
		this.restId = restId;
		this.restName = restName;
		this.restDesc = restDesc;
	}
	public Rest() {
		super();
	}
	@Override
	public String toString() {
		return "Rest [restId=" + restId + ", restName=" + restName + ", restDesc=" + restDesc + "]";
	}
	
	

}
