package com.example.flightBooking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {
    //subtraction
	@Test
	void testSub() {
		Maths math = new Maths();
		int result = math.sub(3,1);
		assertEquals(2,result);
	}
	
	@Test
	void testDivison() {
		Maths math = new Maths();
		float result = math.divide(5,2);
		assertEquals(2.5,result);
	}
	
	
	@Test
	void testAdd() {
		Maths math = new Maths();
		int result = math.add(1,2);
		assertEquals(3,result);
	}

}
