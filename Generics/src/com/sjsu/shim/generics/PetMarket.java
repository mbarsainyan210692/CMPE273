package com.sjsu.shim.generics;

import java.util.ArrayList;
import java.util.List;

public class PetMarket {
private List<PetStore> stores=new ArrayList<PetStore>();
public void addPetStore(PetStore p)
{
stores.add(p);
}
public void displayPetStores()
{
	System.out.println("No of PetStores :"+stores.size());
	for(int i=0;i<stores.size();i++)
	{
		System.out.println("PetStore detail :  owner :"+stores.get(i).getOwner()+" No of pets :"+stores.get(i).countPets());
	}
	}
public List<PetStore> getStores()
{
	return stores;
	}
}
