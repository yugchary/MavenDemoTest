package com.maven.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub() {
		int a=10;
		int b=20;
		Assert.assertEquals(10, -a+b);
	}

}
