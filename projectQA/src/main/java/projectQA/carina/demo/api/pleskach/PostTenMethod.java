package projectQA.carina.demo.api.pleskach;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/todos", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "mypost/post2/rq.json")
@ResponseTemplatePath(path = "mypost/post2/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.CREATED_201)

public class PostTenMethod extends AbstractApiMethodV2 {
    public PostTenMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
