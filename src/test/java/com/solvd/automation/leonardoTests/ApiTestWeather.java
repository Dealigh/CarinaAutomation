package com.solvd.automation.leonardoTests;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.automation.leonardoApi.GetWeather;
import com.solvd.automation.leonardoApi.GetWeatherByCity;
import com.solvd.automation.leonardoApi.GetWeatherUsingImperial;
import com.solvd.automation.leonardoApi.GetWeatherUsingMetric;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class ApiTestWeather implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test(description = "Testing weather API using Latitude and Longitud")
    @MethodOwner(owner = "Leito")
    public void testGetWeatherByLatLon() {
        GetWeather getUsersMethods = new GetWeather();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("automationTest/leonardoApi/_getLatLon/rs.schema");
    }

    @Test(description = "Testing weather API using Metric system")
    @MethodOwner(owner = "Leito")
    public void testGetWeatherUsingMetric() {
        GetWeatherUsingMetric getUsersMethods = new GetWeatherUsingMetric();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("automationTest/leonardoApi/_getMetric/rs.schema");
    }

    @Test(description = "Testing weather API using Imperial system")
    @MethodOwner(owner = "Leito")
    public void testGetWeatherUsingImperial() {
        GetWeatherUsingImperial getUsersMethods = new GetWeatherUsingImperial();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("automationTest/leonardoApi/_getImp/rs.schema");
    }

    @Test(description = "Testing weather API using zip code")
    @MethodOwner(owner = "Leito")
    public void testGetWeatherByZip() {
        GetWeather getUsersMethods = new GetWeather();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("automationTest/leonardoApi/_getZip/rs.schema");
    }

    @Test(description = "Testing weather API using a specific city")
    @MethodOwner(owner = "Leito")
    public void testWeatherByCity() {
        GetWeatherByCity getUsersMethods = new GetWeatherByCity();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getUsersMethods.validateResponseAgainstSchema("automationTest/leonardoApi/_getCity/rs.schema");
    }
}
