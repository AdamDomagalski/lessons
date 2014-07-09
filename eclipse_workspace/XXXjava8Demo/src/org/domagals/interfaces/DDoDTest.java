package org.domagals.interfaces;

public class DDoDTest implements test1, test2{

	// the deadly diamond of death is handled easily by overriding
	@Override
	public void foo() {
		test1.super.foo();
	}
	
}
