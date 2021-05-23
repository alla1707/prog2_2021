package aufgabe05;

import java.util.*;

public class SetOperations {	
	Set<Integer> numbers1;
	Set<Integer> numbers2;
	Set<Integer> both;
	final static int UPPER_BOUND = 100;
	
	public SetOperations()
	{
		this.numbers1 = new TreeSet<>();
		this.numbers2 = new TreeSet<>();
		this.both = new TreeSet<>();
	}
	
	public void fill()
	{
		for(int i=0; i<UPPER_BOUND; i++)
		{
			Random r = new Random();
			this.numbers1.add(Integer.valueOf(r.nextInt(UPPER_BOUND)));
			this.numbers2.add(Integer.valueOf(r.nextInt(UPPER_BOUND)));
		}
	}
	
	public void fillBothUnion()
	{
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                        A "+ "und" +" B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.addAll(numbers1);
		this.both.addAll(numbers2);

	}
	
	public void fillBothIntersection()
	{
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                        A "+ "oder" +" B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.clear();
		this.both.addAll(numbers1);
		this.both.retainAll(numbers2);
	}
	
	public void fillBothDifference()
	{
		System.out.println();
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("         A                           B                          A-B ");
		System.out.println("----------------------------------------------------------------------------");
		this.both.addAll(numbers1);
		this.both.removeAll(numbers2);
	}
	
	
	public void print()
	{
		int counter1=0;
		int counter2=0;
		int counterboth=0;
		for(int curRow=0; curRow<10; curRow++)
		{
			for(int curCol=0; curCol<10; curCol++)
			{
				if(this.numbers1.contains(Integer.valueOf(counter1)))
				{
					System.out.print(" " + " ");
				}
				
				else
				{
					System.out.print(" " + "0");
				}
				
				counter1++;
			}
			
			printSpaces(8);
			
			for(int curCol=0; curCol<10; curCol++)
			{
				if(this.numbers2.contains(Integer.valueOf(counter2)))
				{
					System.out.print(" "+ "0");
				}
				
				else
				{
					System.out.print(" " + " ");
				}
				
				counter2++;
			}
			
			printSpaces(8);
			
			for(int curCol=0; curCol<10; curCol++)
			{
				if(this.both.contains(Integer.valueOf(counterboth)))
				{
					System.out.print(" " + "0");
				}
				
				else
				{
					System.out.print(" " + " ");
				} 
				
				counterboth++;
			}
			System.out.println();
		}
	}
	
	private void printSpaces(int nrOfSpaces)
	{
		for(int spaces=0; spaces<nrOfSpaces; spaces++) System.out.print(" ");
	}	
}

	
	
 

