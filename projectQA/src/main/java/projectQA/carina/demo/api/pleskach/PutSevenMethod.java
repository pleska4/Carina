package projectQA.carina.demo.api.pleskach;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/albums/1/photos", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "myput/put3/rq.json")
@ResponseTemplatePath(path = "myput/put3/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutSevenMethod extends AbstractApiMethodV2 {
    public PutSevenMethod() {
       replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}