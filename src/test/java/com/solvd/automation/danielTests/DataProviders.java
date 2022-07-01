package com.solvd.automation.danielTests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.report.testrail.TestRailCases;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;

public class DataProviders extends AbstractTest {

    @Test(dataProvider = "DataProvider")
    @MethodOwner(owner = "Daniel_Rodriguez")
    @TestRailCases(testCasesId = "1") //ask this
    @XlsDataSourceParameters(path = "xls/ddata.xlsx", sheet = "Fibonacci", dsUid = "TUID", testRailColumn = "Arg")
    public void testSumOperationEx(HashMap<String, String> args) {
        int actual = Integer.valueOf(args.get("Arg")) + Integer.valueOf(args.get("Path"));
        int expected = Integer.valueOf(args.get("Result"));
        Assert.assertEquals(actual, expected, "Invalid sum result!");
    }

    @Test(dataProvider = "DP1")
    @MethodOwner(owner = "Daniel_Rodriguez")
    @TestPriority(Priority.P3)
    @TestRailCases(testCasesId = "44") //ask this
    public void testMuliplyOperation(String testRailColumn, int a, int b, int c, int d) {
        setCases(testRailColumn.split(","));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(a + b, c);
        softAssert.assertEquals(a * b, d);
        softAssert.assertAll("One of the values isn´t right");
    }

    @DataProvider(name = "DP1")
    public static Object[][] dataprovider() {
        return new Object[][]{
                {"TUID: Data1", 10, 5, 15, 50},
                {"TUID: Data2", 7, 5, 12, 35},
                {"TUID: Data3", 12, 6, 18, 72},
                {"TUID: Data4", 5, 5, 10, 25},
                {"TUID: Data5", 100, 20, 120, 2000}
        };
    }
}
