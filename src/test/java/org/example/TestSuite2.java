package org.example;


import org.junit.jupiter.api.Tag;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
// @SelectPackages("org.example")
@IncludeTags("paramSumm")
@Tag("testsuite2")
@SelectClasses({CalcTest.class})
public class TestSuite2 {
}
