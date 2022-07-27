package testngFramework;

import org.testng.annotations.Test;

public class DisablingTestScripts {
	@Test
	public void f1() {
		System.out.println("Printing f1");
	}
	@Test
	public void f2() {
		System.out.println("Printing f2");
	}
	@Test (enabled=false)
	public void f3() {
		System.out.println("Printing f3");
	}
	@Test
	public void f4() {
		System.out.println("Printing f4");
	}
	@Test (enabled=false)
	public void f5() {
		System.out.println("Printing f5");
	}


		
	}


