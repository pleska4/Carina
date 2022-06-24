package projectQA.carina.demo.api.pleskach;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

@Endpoint(url = "${base_url}/posts/1", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "myput/put2/rq.json")
@ResponseTemplatePath(path = "myput/put2/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutSixMethod extends AbstractApiMethodV2 {
    public PutSixMethod() {
       replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}