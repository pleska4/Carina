package projectQA.carina.demo.api.pleskach;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostThreeMethod extends AbstractApiMethodV2 {
    public PostThreeMethod() {
        super("mypost/post1/rq.json", "mypost/post1/rs.json", "mypost/user.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
