package com.sjsu.shim.queue;

public class Utility {

public static double solveExpression(String exp) {
	String[] finalStr = exp.split("(?<=[-+*/])|(?=[-+*/])");
	System.out.println();
	double result=Double.parseDouble(finalStr[0]);
	for(int i=0;i<finalStr.length-2;i=i+2)
	{
	String op=finalStr[i+1];
	double temp=Double.parseDouble(finalStr[i+2]);
	result=Double.parseDouble(calculate(op, result, temp));
	}
	return result;
}


public static String calculate(String operator, double operand1, double operand2) {
	if (operator.equals("+"))
    {
        return String.valueOf(operand1 + operand2);
    }
    else if (operator.equals("-"))
    {
        return String.valueOf(operand1 - operand2);
    }
    else if (operator.equals("*"))
    {
        return String.valueOf(operand1 * operand2);
    }
    else
    {
        return "error...";
    }
}
}
