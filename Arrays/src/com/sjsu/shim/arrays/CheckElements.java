package com.sjsu.shim.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckElements {
	
	public Elements[] printElements(Elements[] elements)
	{
		Elements[] metals;
		metals=new Elements[elements.length];
		for(int i=0;i<elements.length;i++)
		{
			if(elements[i].isMetal())
			{
				metals[i]=elements[i];
				System.out.println(elements[i].getName());
			}
		}
	return metals;
}
	
}
