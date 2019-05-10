package org.example.projectA;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntegrationTestImplA extends IntegrationTest {

	@Test
	public void testSomeLibraryAMethod() {
		LibraryA classUnderTest = new LibraryA();
		assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
	}

}
