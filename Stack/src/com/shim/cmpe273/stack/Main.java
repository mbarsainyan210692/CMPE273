package com.shim.cmpe273.stack;

import java.util.ArrayList;
import java.util.List;


public class Main {
	public static ArrayList<Node> nodes=new ArrayList<Node>();

	public static void main(String arg[]) 
	{
		
	Node node40 =new Node(40);
	
	Node node10 =new Node(10); 
	Node node20 =new Node(20);
	Node node30 =new Node(30);
	Node node60 =new Node(60);
	Node node50 =new Node(50);
	Node node70 =new Node(70); 
	nodes.add(node40);
	nodes.add(node10);
	nodes.add(node20); 
	nodes.add(node30);
	nodes.add(node60);
	nodes.add(node50); 
	nodes.add(node70); 
	int adjacencymatrix[][] = 
		{
				{0,1,1,0,0,0,0}, {0,0,0,1,0,0,0}, {0,1,0,1,1,1,0}, {0,0,0,0,1,0,0},
				{0,0,0,0,0,0,1},{0,0,0,0,0,0,1}, {0,0,0,0,0,0,0}};
		
	
	DFSUsingStack dfsExample = new DFSUsingStack(nodes); 
	List<Node> visitednodes=dfsExample.depthFirstsearch(adjacencymatrix, node40); 
	for(Node n:visitednodes)
	{
		System.out.println(n.data);
	}
	}
			
}
