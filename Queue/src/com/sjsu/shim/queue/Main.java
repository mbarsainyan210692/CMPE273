package com.sjsu.shim.queue;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args)
{
	String s="10+20+30";
	String s2="10+20-30";
	String s3="100+210-30";
	String s4="10*20-30";
	String s5="10+20*30";

	List<String> exp=new ArrayList<String>();
	exp.add(s);
	exp.add(s2);
	exp.add(s3);
	exp.add(s4);
	exp.add(s5);
	SolvePuzzle sp=new SolvePuzzle();
	sp.solve(exp);
	
}
}
