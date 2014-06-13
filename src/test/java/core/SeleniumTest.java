package core;


import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;

import org.junit.ComparisonFailure;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class SeleniumTest {

	@BeforeClass
	public static void BeforeClass01() throws Exception  {

	}

       // Test data generator

       @Parameters(name = "Iteration # {index} : exp: {1}; act: {2}")

       public static Collection<String[]> data() throws IOException {

    	   core.Selenium selenuim = new core.Selenium();

              return Arrays.asList(selenuim.a2d());


       }

       // @Parameter for Field injection instead of Constructor

@Parameter(value = 0)

       public String test_id;

       @Parameter(value = 1)
       public String expected_Result;

       @Parameter(value = 2)
       public String actual_Result;

       @Test
       public void test_Title_Validation()  throws ComparisonFailure {

             System.out.println("Test Case: " + test_id + " Expected Result: " + expected_Result + " Actual Result: " + actual_Result);

             assertEquals("FAILED", expected_Result, actual_Result);

       }


}