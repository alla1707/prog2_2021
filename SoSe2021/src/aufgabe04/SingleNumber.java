package aufgabe04;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
	
	 public static int singleNumber(int[] nums) {
	    List<Integer> list = new ArrayList<>();
	    final int NOT_FOUND = -1;
	    
	    for (int i : nums) { if (!list.contains(i)) { list.add(i);
	 }
	    else {
	        list.remove(new Integer(i));
	      }
	    }
	    if(list.size()==0) //isEmpty()
	    {
	    	System.out.println("Es wurde keine eindeutige Nummer gefunden."); return NOT_FOUND;
	    }
	    else { // System.out.println(list);
	    	for(int i=0;i<list.size();i++){
	    	    System.out.println(list.get(i));
	    	}
		    return list.get(0);
	    }
	  }
		
	public static void main(String[] args) {
		int [] input = {4,2,3,4,2};
		singleNumber(input);
	}
}
