package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.platform.suite.api.*;

@Suite
//@SelectPackages("org.example")
 @IncludeTags("paramVichitanie")
@ExcludeTags("testsuite2")
@Tag("testsuite1")
@SelectClasses({CalcTest.class})
public class TestSuite {

}
