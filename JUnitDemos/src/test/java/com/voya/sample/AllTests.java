package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import com.voya.testcases.CalculatorTest;




@RunWith(JUnitPlatform.class)
@SelectPackages({"com"})
//@ExcludePackages({"com.voya.testcases.trail"})
//@SelectClasses({CalculatorTest.class})
@ExcludeTags({"First"})
@IncludeTags({"Negative","Second","Simple"})
public class AllTests {

}
