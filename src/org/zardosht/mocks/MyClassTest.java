package org.zardosht.mocks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyClassTest {

	@Mock
	private MyBar mockMyBar;

	@Test
	public void testDoFoo() {
		// assume there is a class called ClassToTest
		// which could be tested
		MyClass myClass = new MyClass(mockMyBar);

		// call a method
		myClass.doFoo();

		// test that the query() method on the
		// mock object was called
		Mockito.verify(mockMyBar).doBar();
	}

}
