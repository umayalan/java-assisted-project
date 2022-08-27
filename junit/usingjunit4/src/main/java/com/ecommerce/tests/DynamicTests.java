package com.ecommerce.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.function.Executable;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.DynamicTest.*;
 
@DisplayName("JUnit 5 Dynamic Tests Example")
@RunWith(JUnitPlatform.class)
public class DynamicTests {

        @TestFactory
    Collection<DynamicTest> dynamicTests() {
        return Arrays.asList(
            dynamicTest1("simple dynamic test", () -> assertTrue(true)),
            dynamicTest1("My Executable Class", new MyExecutable()),
            dynamicTest1("Exception Executable", () -> {throw new Exception("Exception Example");}),
            dynamicTest1("simple dynamic test-2", () -> assertTrue(true))
        );
    }

		private DynamicTest dynamicTest1(String string, Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		private DynamicTest dynamicTest(String string, Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		private DynamicTest dynamicTest1(String string, Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		private DynamicTest dynamicTest1(String string, Object object) {
			// TODO Auto-generated method stub
			return null;
		}

		private DynamicTest dynamicTest1(String string, Object object) {
			// TODO Auto-generated method stub
			return null;
		}

}


class MyExecutable implements Executable {

        public void execute() throws Throwable {
                System.out.println("Hello World!");
        }

}
