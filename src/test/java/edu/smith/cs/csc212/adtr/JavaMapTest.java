package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	//put
	//get
	//size
	//remove
	
	
	
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testPut() {
		MapADT<String, String> foo = new JavaMap<>();
		foo.put("m", "d");
		assertEquals("d", foo.get("m"));
		assertEquals(1,foo.size());
	}
	
	@Test
	public void testReplacePut() {
		MapADT<String, String> replace = new JavaMap<>();
		replace.put("ml", "d");
		replace.put("cr", "d");
		replace.put("la", "d");
		replace.put("dl", "l");
		replace.put("ml", "r");
		assertEquals("r", replace.get("ml"));
		assertEquals(4,replace.size());
	}
	
	@Test
	public void testRepeatPut() {
		MapADT<String, String> repeat = new JavaMap<>();
		repeat.put("ml", "d");
		repeat.put("cr", "d");
		repeat.put("la", "d");
		repeat.put("dl", "l");
		repeat.put("ml", "d");
		assertEquals(4,repeat.size());
	}
	
	@Test
	public void testGet() {
		MapADT<String, String> bar = new JavaMap<>();
		bar.put("ml", "d");
		bar.put("la", "d");
		assertEquals("d", bar.get("ml"));
		assertEquals("d", bar.get("la"));
	}
	
	
	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	@Test
	public void testSize1() {
		MapADT<String, String> single = new JavaMap<>();
		single.put("m", "d");
		assertEquals(1, single.size());
	}
	
	@Test
	public void testSize4() {
		MapADT<String, String> four = new JavaMap<>();
		four.put("a", "b");
		four.put("c", "d");
		four.put("e", "f");
		four.put("g", "h");
		assertEquals(4, four.size());
	}
	
	@Test
	public void testRemove() {
		MapADT<String, String> letters = new JavaMap<>();
		letters.put("a", "b");
		letters.put("c", "d");
		letters.put("e", "f");
		letters.put("g", "h");
		letters.remove("g");
		assertEquals(3, letters.size());
		
	}
	
	
	
}
