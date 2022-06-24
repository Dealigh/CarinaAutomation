package com.solvd.automation.leandroTests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.leandroApi.GetWeatherByCityMethod;
import com.solvd.automation.leandroApi.GetWeatherByCoordsMethod;
import com.solvd.automation.leandroApi.GetWeatherByIdMethod;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class ApiTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "Leandro")
    public void testGetWeatherByCity() {
        LOGGER.info("TEST: Get weather test by city: " + Configuration.getEnvArg("city"));
        GetWeatherByCityMethod getWM = new GetWeatherByCityMethod();
        getWM.callAPIExpectSuccess();
        getWM.validateResponse(JSONCompareMode.STRICT_ORDER, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWM.validateResponseAgainstSchema("automationTest/leandroApi/_get/byCityName/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "Leandro")
    public void testGetWeatherByCoords() {
        LOGGER.info("TEST: Get weather by coordinates\n\tLatitude: " + Configuration.getEnvArg("lat")
                + "\n\tLongitude: " + Configuration.getEnvArg("lon"));
        GetWeatherByCoordsMethod getWeatherByCoords = new GetWeatherByCoordsMethod();
        getWeatherByCoords.callAPIExpectSuccess();
        getWeatherByCoords.validateResponse(JSONCompareMode.STRICT_ORDER, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWeatherByCoords.validateResponseAgainstSchema("automationTest/leandroApi/_get/byCoords/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "Leandro")
    public void testGetWeatherById() {
        LOGGER.info("TEST: Get weather by city id: " + Configuration.getEnvArg("cityId"));
        GetWeatherByIdMethod getWeatherById = new GetWeatherByIdMethod();
        getWeatherById.callAPIExpectSuccess();
        getWeatherById.validateResponse(JSONCompareMode.STRICT_ORDER, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWeatherById.validateResponseAgainstSchema("automationTest/leandroApi/_get/byCityId/rs.schema");
    }
}
