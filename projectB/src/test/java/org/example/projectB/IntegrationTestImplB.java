package org.example.projectB;

import org.example.projectA.IntegrationTest;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntegrationTestImplB extends IntegrationTest {

    @Test public void testSomeLibraryBMethod() {
        LibraryB classUnderTest = new LibraryB();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
