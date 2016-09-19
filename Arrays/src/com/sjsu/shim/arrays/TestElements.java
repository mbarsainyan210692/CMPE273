package com.sjsu.shim.arrays;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestElements {

	@Test
	public void test() {
		Elements e1=new Elements("Gold", 18);
		Elements e2=new Elements("Iron", 1);
		Elements e3=new Elements("Graphite", 3);
		Elements e4=new Elements("Silver", 16);
		Elements e5=new Elements("Platinum", 13);
		Elements e6=new Elements("Phosphorous", 3);
		Elements e7=new Elements("Cobalt", 14);
		Elements e8=new Elements("Aluminium", 17);
		Elements e9=new Elements("Sulphur", 1);
		
		Elements[] elements = {e1,e2 ,e3 ,e4,e5 ,e6 ,e7 ,e8,e9};
		Elements[] metals =new Elements[elements.length];
		metals[0]=e1;
		metals[1]=e4;
		metals[2]=e5;
		metals[3]=e7;
		metals[4]=e8;
		
		
		CheckElements ck=new CheckElements();
		Elements[] list=ck.printElements(elements);
		assertNotNull(list);
		assertEquals(list.length,metals.length);
		
	}

}
