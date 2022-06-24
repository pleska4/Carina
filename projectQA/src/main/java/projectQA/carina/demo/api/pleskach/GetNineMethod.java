package projectQA.carina.demo.api.pleskach;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

@Endpoint(url = "${base_url}/todos", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "myget/get2/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetNineMethod extends AbstractApiMethodV2 {
    public GetNineMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
