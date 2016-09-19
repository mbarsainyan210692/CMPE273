package com.shim.cmpe273.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSUsingStack {
	public static ArrayList<Node> nodes = new ArrayList<Node>();
	public static List<Node> visited=new ArrayList<Node>(); 
	public DFSUsingStack(ArrayList<Node> nodes)
	{
		this.nodes=nodes;
	}
	public List<Node> depthFirstsearch(int adjacencymatrix[][], Node currNode)
	{
		Stack<Node> stack = new Stack<Node>();
		stack.add(currNode);
		
		currNode.visited = true;
		while (!stack.isEmpty()) {
			Node n = stack.pop();
			System.out.print(n.data + "\t");
			visited.add(n);
			ArrayList<Node> adjoiningNodes = getAdjoiningNodes(adjacencymatrix, n);
			for (int i = 0; i < adjoiningNodes.size(); i++) {
				Node nbr = adjoiningNodes.get(i);
				if (nbr != null && !nbr.visited)

				{
					stack.add(nbr);
					nbr.visited = true;
				}
			}
		}
		return visited;
	}

	public ArrayList<Node> getAdjoiningNodes(int adjacencymatrix[][], Node n) {
		int index = -1;
		ArrayList<Node> adjoiningNodes = new ArrayList<Node>();
		for (int i = 0; i < nodes.size(); i++) {
			if (nodes.get(i).equals(n)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			for (int j = 0; j < adjacencymatrix[index].length; j++) {
				if (adjacencymatrix[index][j] == 1) {
					adjoiningNodes.add(nodes.get(j));
				}
			}
		}
		return adjoiningNodes;
	}
}