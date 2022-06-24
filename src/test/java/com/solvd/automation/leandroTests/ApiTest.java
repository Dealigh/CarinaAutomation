package com.solvd.automation.leandroTests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.leandroApi.GetWeatherMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class ApiTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "LeoM")
    public void testGetWeather() {
        LOGGER.info("Get weather test");
        GetWeatherMethod getWM = new GetWeatherMethod();
        getWM.callAPIExpectSuccess();
        getWM.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWM.validateResponseAgainstSchema("automationTest/leandroApi/_get/rs.schema");
    }
}
