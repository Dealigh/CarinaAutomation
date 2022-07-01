package com.solvd.automation.leonardoTests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.leonardoApi.GetWeatherByZip;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class ApiTestByCity implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "Leito")
    public void testWeatherByCity() {
        GetWeatherByZip getUsersMethods = new GetWeatherByZip();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("automationTest/leonardoApi/_getCity/rs.schema");
    }



}
