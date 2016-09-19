package com.sjsu.shim.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CreatePuzzle {
	private static Queue<Puzzle> puzzles=new LinkedList<Puzzle>();
	private static CreatePuzzle cr;
	private CreatePuzzle()
	{
		
	}
	public static CreatePuzzle getInstance(List<String> exp)
	{
		if(cr==null)
		{
			for(String s:exp)
			{
				
				puzzles.add(new Puzzle(s));
			}
		cr=new CreatePuzzle();
		
		}
		return cr;
	}
	public Puzzle getNextKey(Double solution,Puzzle key)
	{
		double soln=Utility.solveExpression(key.getExpression());
		if(soln==solution)
		{
			return puzzles.poll();
		}
		else
		{
			return null;
		}
		
	}
	public Puzzle getFirstKey()
	{
	return puzzles.poll();	
	}
	public int getNoOfPuzzles()
	{
	return puzzles.size();	
	}
}
