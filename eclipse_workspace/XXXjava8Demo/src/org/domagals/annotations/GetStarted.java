package org.domagals.annotations;

import org.checkerframework.checker.nullness.qual.*;

public class GetStarted {
	void sample() {
		@NonNull Object ref = foo();
	}

	public static String foo() {
		if (System.currentTimeMillis() % 2 == 0) {
			return "bar";
		}
		return "bar";
	}
}
