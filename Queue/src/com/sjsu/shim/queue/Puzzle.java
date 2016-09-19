package com.sjsu.shim.queue;

import java.beans.Expression;
import java.util.LinkedList;
import java.util.Queue;

public class Puzzle {
private String expression="";
public Puzzle(String expression)
{
this.expression=expression;	
}
public String getExpression() {
	return expression;
}
public void setExpression(String expression) {
	this.expression = expression;
}
}
