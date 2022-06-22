package com.solvd.Automation;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.Automation.utils.AuthenticationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class BasicTravelTest extends AbstractTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    protected AuthenticationUtil authUtil = new AuthenticationUtil();
}
