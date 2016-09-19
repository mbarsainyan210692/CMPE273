package com.sjsu.cmpe273.ass1;

public class Subordinates implements Invitable {
	private int humour;
	private int intellact;
	private String name = "";

	public Subordinates(String name, int humour, int intellact) {
		this.humour = humour;
		this.intellact = intellact;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int humourIndex() {
		// TODO Auto-generated method stub
		return humour;
	}

	@Override
	public int intellactIndex() {
		// TODO Auto-generated method stub
		return intellact;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
