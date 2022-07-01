package com.solvd.automation;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.automation.service.IHotels;
import com.solvd.automation.service.ILogin;
import com.solvd.automation.service.ITours;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class BasicTravelTest extends AbstractTest implements ILogin, IHotels, ITours {

    public static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
}
