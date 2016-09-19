package com.sjsu.shim.queue;

import java.util.Arrays;
import java.util.List;

public class SolvePuzzle {
public static boolean solve(List<String> exp) {
CreatePuzzle cr=CreatePuzzle.getInstance(exp);
Puzzle p=cr.getFirstKey();
while(cr.getNoOfPuzzles()>1)
{
	String expression=p.getExpression();
	Double solution=Utility.solveExpression(expression);
	p=cr.getNextKey(solution,p);
	if(p==null)
	{
		System.out.println("You Lose!!!! :P");
		return false;
	}
}
System.out.println("Congratulations you have won the game :)");
return true;
}
}
