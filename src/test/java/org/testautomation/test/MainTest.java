package org.testautomation.test;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MainTest {
    @Test
    public void test() {
        assertEquals("True", "True", "Strings should match.");
    }
}
