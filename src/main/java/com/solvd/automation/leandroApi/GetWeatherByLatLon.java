package com.solvd.automation.leandroApi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url= "${base_url}/data/2.5/weather?q=London&appid=5593ead48ecbc622b6a14a5c55fbe3c7", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "automationTest/leandroApi/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetWeatherByLatLon extends AbstractApiMethodV2 {

    public GetWeatherByLatLon() {replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));}
}


