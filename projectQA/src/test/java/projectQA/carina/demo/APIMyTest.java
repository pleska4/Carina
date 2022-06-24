package projectQA.carina.demo;

import java.lang.invoke.MethodHandles;

import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.api.APIMethodPoller;
import java.util.concurrent.atomic.AtomicInteger;
import java.time.temporal.ChronoUnit;

import projectQA.carina.demo.api.pleskach.*;

/**
 * This sample shows how create REST API tests.
 *
 * @author qpsdemo
 */
public class APIMyTest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "pleska4")
    public void testOneGet() {
        GetOneMethod getOneMethod = new GetOneMethod();
        getOneMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getOneMethod.callAPI();
        getOneMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getOneMethod.validateResponseAgainstSchema("myget/get1/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "pleska4")
    public void testTwoDelete() {
        DeleteTwoMethod deleteTwoMethod = new DeleteTwoMethod();
        deleteTwoMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteTwoMethod.callAPI();
        deleteTwoMethod.validateResponse();
    }
    @Test()
    @MethodOwner(owner = "pleska4")
    public void testThreeCreate() throws Exception {
        LOGGER.info("test");
        setCases("4555,54545");
        PostThreeMethod api = new PostThreeMethod();
        api.setProperties("myget/user.properties");

        AtomicInteger counter = new AtomicInteger(0);

        api.callAPIWithRetry()
                .withLogStrategy(APIMethodPoller.LogStrategy.ALL)
                .peek(rs -> counter.getAndIncrement())
                .until(rs -> counter.get() == 4)
                .pollEvery(1, ChronoUnit.SECONDS)
                .stopAfter(10, ChronoUnit.SECONDS)
                .execute();
        api.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "pleska4")
     public void testFourDelete() {
        DeleteFourMethod deleteFourMethod = new DeleteFourMethod();
        deleteFourMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteFourMethod.callAPI();
        deleteFourMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "pleska4")
     public void testFivePut(){
        PutFiveMethod putFiveMethod = new PutFiveMethod();
        putFiveMethod.setProperties("myput/user.properties");
        putFiveMethod.callAPIExpectSuccess();
        putFiveMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "pleska4")
    public void testSixPut(){
        PutSixMethod putSixMethod = new PutSixMethod();
        putSixMethod.setProperties("myput/postos.properties");
        putSixMethod.callAPIExpectSuccess();
        putSixMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "pleska4")
    public void testSevenPut(){
        PutSevenMethod putSevenMethod = new PutSevenMethod();
        putSevenMethod.setProperties("myput/seven.properties");
        putSevenMethod.callAPIExpectSuccess();
        putSevenMethod.validateResponse();
    }
    @Test()
    @MethodOwner(owner = "pleska4")
    public void testEightDelete() {
        DeleteEightMethod deleteEightMethod = new DeleteEightMethod();
        deleteEightMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteEightMethod.callAPI();
        deleteEightMethod.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "pleska4")
    public void testNineGet() {
        GetNineMethod getNineMethod = new GetNineMethod();
        getNineMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getNineMethod.callAPI();
        getNineMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getNineMethod.validateResponseAgainstSchema("myget/get2/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "pleska4")
    public void testTenCreate() throws Exception {
        LOGGER.info("test");
        setCases("4555,54545");
        PostTenMethod api = new PostTenMethod();
        api.setProperties("mypost/user.properties");

        AtomicInteger counter = new AtomicInteger(0);

        api.callAPIWithRetry()
                .withLogStrategy(APIMethodPoller.LogStrategy.ALL)
                .peek(rs -> counter.getAndIncrement())
                .until(rs -> counter.get() == 4)
                .pollEvery(1, ChronoUnit.SECONDS)
                .stopAfter(10, ChronoUnit.SECONDS)
                .execute();
        api.validateResponse();
    }


}
