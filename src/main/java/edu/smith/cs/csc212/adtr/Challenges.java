package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class Challenges {

	// The union of two sets is the set of elements that either contains.
	public static SetADT<Integer> union(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
		for(Integer i: right)
			output.insert(i);
		for(Integer i: left)
			output.insert(i);
		return output;
	}
	
	// The intersection of two sets is the set of elements that both contain.
	public static SetADT<Integer> intersection(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
		for(Integer i: right)
			if(left.contains(i))
				output.insert(i);
		return output;
	}
	
	// Count the words in the input list and put them in the map.
	public static MapADT<String, Integer> wordCount(ListADT<String> words) {
		MapADT<String, Integer> output = new JavaMap<>();
		
		for(int i=words.size()-1; i>=0; i--) {
			if(output.get(words.getBack())!=null) {
				output.put(words.getBack(), (output.get(words.getBack())+1));
			}
			else
				output.put(words.getBack(), 1);
			words.removeBack();
		}
			
		return output;
	}
}
