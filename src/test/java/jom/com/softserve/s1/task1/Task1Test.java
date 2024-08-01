package jom.com.softserve.s1.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Method;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

	private static String CIRCLE = "jom.com.softserve.s1.task1.Circle";

	@DisplayName("Check that Circle class is present")
	@Test
	public void isTypeClassCircle() {
		try {
			assertNotNull(Class.forName(CIRCLE));
			assertEquals("Circle", Class.forName(CIRCLE).getSimpleName());
		} catch (ClassNotFoundException e) {
			fail("There is no Circle class");
		}
	}

	@DisplayName("Check that Circle class has 'draw' method")
	@ParameterizedTest
	@MethodSource("provideDataCircleClass")
	void hasTypeDeclaredMethod(String className, String methodName, Class[] params) {
		Method[] methods = null;
		try {
			methods = Class.forName(CIRCLE).getDeclaredMethods();
		} catch (ClassNotFoundException e) {
			fail("There is no Circle class");
		}
		boolean isMethod = false;
		for (Method method : methods) {
			if (method.getName().equals(methodName)) {
				isMethod = true;
				break;
			}
		}
		assertTrue(isMethod);
	}

	private static Stream<Arguments> provideDataCircleClass() {
		return Stream.of(Arguments.of(CIRCLE, "draw", new Class[] {}),
				Arguments.of(CIRCLE, "draw", new Class[] { String.class }),
				Arguments.of(CIRCLE, "draw", new Class[] { float.class }),
				Arguments.of(CIRCLE, "draw", new Class[] { String.class, float.class }));
	}
}
