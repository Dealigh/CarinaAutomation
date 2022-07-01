package com.solvd.automation.leonardoTests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.leonardoApi.GetWeatherUsingImperial;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class ApiTestImperial implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "Leito")
    public void testGetWeatherUsingImperial() {
        GetWeatherUsingImperial getUsersMethods = new GetWeatherUsingImperial();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("automationTest/leonardoApi/_getImp/rs.schema");
    }
}
