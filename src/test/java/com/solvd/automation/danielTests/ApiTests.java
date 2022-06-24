package com.solvd.automation.danielTests;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.APIMethodPoller;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.core.foundation.utils.tag.Priority;
import com.qaprosoft.carina.core.foundation.utils.tag.TestPriority;
import com.solvd.automation.danielApi.DeleteUserMethod;
import com.solvd.automation.danielApi.GetUserMethods;
import com.solvd.automation.danielApi.PostUserMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ApiTests implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "Daniel Rodriguez")
    public void testCreateUser() {
        LOGGER.info("test");
        setCases("4555,54545");
        PostUserMethod api = new PostUserMethod();
        api.setProperties("automationTest/danielApi/user.properties");

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
    @MethodOwner(owner = "Daniel Rodriguez")
    public void testGetUsers() {
        GetUserMethods getUsersMethods = new GetUserMethods();
        getUsersMethods.callAPIExpectSuccess();
        getUsersMethods.validateResponseAgainstSchema("automationTest/danielApi/reqresApi/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "Daniel Rodriguez")
    @TestPriority(Priority.P1)
    public void testDeleteUsers() {
        DeleteUserMethod deleteUserMethod = new DeleteUserMethod();
        deleteUserMethod.setProperties("automationTest/danielApi/user.properties");
        deleteUserMethod.callAPIExpectSuccess();
        deleteUserMethod.validateResponse();
    }
}
