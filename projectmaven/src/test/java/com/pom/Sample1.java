package com.pom;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test
	private void test() {
		System.out.println("1");
	}
	@Test
	private void test1() {
		System.out.println("2");
	}
	@Test
	private void test3() {
	System.out.println("3");

	}
	@Test
	private void test2() {
		System.out.println("4");
	}
	@Test
	private void test5() {
		System.out.println("5");
	}
	@Test(priority = -10)
	private void test6() { System.out.println("6");}
	@Test
	private void test4() {
System.out.println("7");}
}
