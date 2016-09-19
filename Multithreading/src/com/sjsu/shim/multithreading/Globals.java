package com.sjsu.shim.multithreading;

import java.util.HashMap;
import java.util.Map;

public class Globals {
public static Map<String,Integer> costByNameMap;
static
{
	initializeCostByNameMap();	
}
public static void initializeCostByNameMap()
{
	costByNameMap=new HashMap<String,Integer>();
	costByNameMap.put("a",10);
	costByNameMap.put("b",20);
	costByNameMap.put("c",30);
	
}

}
