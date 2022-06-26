package com.solvd.automation.leonardoTests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

import com.solvd.automation.leonardoApi.GetWeatherUsingMetric;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class ApiTestMetric implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "Leito")
    public void testGetWeatherUsingMetric() {
        GetWeatherUsingMetric getUsersMethods = new GetWeatherUsingMetric();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("automationTest/leonardoApi/_getMetric/rs.schema");
    }
}
