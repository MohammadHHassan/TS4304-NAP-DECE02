package day10.datastructures;

import java.util.ArrayList;

public class LearningArrayList
{
	public static void main(String[] args)
	{
		// Declaration of ArrayList with String type
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Mohammad");
		nameList.add("Haji");
		nameList.add("Hassan");
		
		for(String a : nameList)
		{
			System.out.print(a + " ");
		}
		System.out.println();
		
		nameList.add("Haji");
		nameList.add("Hashim");
		
		for(String b : nameList)
		{
			System.out.print(b + " ");
		}
		System.out.println();
		
		nameList.remove(1);			// Haji
		nameList.remove(2);
		
		for(String c : nameList)
		{
			System.out.print(c + " ");
		}
		System.out.println();
		
		nameList.add(1, "Bin");
		nameList.add(3, "Bin");
		
		for(String c : nameList)
		{
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("nameList[2] = " + nameList.get(2));
		System.out.println("Size of the nameList Array = " + nameList.size());
	}
}
