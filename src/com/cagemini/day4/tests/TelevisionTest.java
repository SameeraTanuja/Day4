package com.cagemini.day4.tests;


import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TelevisionTest {
	Television tel;
	@BeforeEach
	void setup() {
		tel=new Television();
	}

	@Test
	void testchangeVolume() {
		assertEquals(35, tel.changeVolume(35));
		
	}
	@Test
	void testchangeChannel() {
		assertEquals(15,tel.changeChannel(15));
		
	}
	@AfterEach
	void disp()
	{
		tel.display();
	}
	
}
	