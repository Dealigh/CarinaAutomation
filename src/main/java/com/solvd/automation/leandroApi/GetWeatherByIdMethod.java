package com.solvd.automation.leandroApi;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/data/2.5/weather?id=${config.env.cityId}&appid=${config.env.key}" , methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "automationTest/leandroApi/_get/byCityId/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetWeatherByIdMethod extends AbstractApiMethodV2 {

    public GetWeatherByIdMethod () {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
