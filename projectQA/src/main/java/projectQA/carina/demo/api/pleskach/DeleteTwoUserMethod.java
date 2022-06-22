package projectQA.carina.demo.api.pleskach;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeleteTwoUserMethod extends AbstractApiMethodV2 {

    public DeleteTwoUserMethod() {
        super("api/users/_delete/rq.json", "api/users/_delete/rs.json", "api/users/user.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
