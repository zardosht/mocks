package org.zardosht.mocks;

public class MyClass {

	private MyBar myBar;

	public MyClass(MyBar myBar) {
		this.myBar = myBar;
	}

	public void doFoo() {
		System.out.println("doFoo() called");
		myBar.doBar();
	}

}
