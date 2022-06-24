package projectQA.carina.demo.api.pleskach;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

import java.util.Properties;

public class GetOneMethod extends AbstractApiMethodV2 {
    public GetOneMethod() {
        super(null, "myget/get1/rs.json", new Properties());
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
