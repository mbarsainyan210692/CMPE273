package com.sjsu.shim.generics;

import java.util.ArrayList;
import java.util.List;

public class PetStore<T> {

	public PetStore(String owner)
	{
		this.owner=owner;
	}
	private List<T> pets=new ArrayList<T>();
	private String owner;
	
	public List<T> getPets() {
		return pets;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void addPet(T pet)
	{
		this.pets.add(pet);
	}

	public int countPets()
	{
		return pets.size();
	}
}
