/*
 * Copyright 2005-2010 Ignis Software Tools Ltd. All rights reserved.
 */
package jsystem.runner;

import java.util.Enumeration;

/**
 * Collects Test class names to be presented by the TestSelector. 
 * @see TestSelector
 */
public interface TestCollector {
	
	/**
	 * Returns an enumeration of Strings with qualified class names
	 */
	public Enumeration<String> collectTests();
}
