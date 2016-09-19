package com.sjsu.shim.arrays;


public class Elements {
private int melleabilityIndex;
private String name="";
public Elements(String name,int melleabilityIndex)
{
	this.melleabilityIndex=melleabilityIndex;
	this.name=name;
}
public int getMelleabilityIndex() {
	return melleabilityIndex;
}
public void setMelleabilityIndex(int melleabilityIndex) {
	this.melleabilityIndex = melleabilityIndex;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isMetal()
{
if(this.melleabilityIndex>10)
{
return true;	
}
return false;
}
@Override
public boolean equals(Object e)
{
	if(e instanceof Elements)
	{
		if(this.name.equals(((Elements) e).name))
		{
			return true;
		}
	}
	return false;
	}
}
