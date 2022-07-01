package com.solvd.automation;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.automation.webgui.service.Login;
import com.solvd.automation.service.IHotels;
import com.solvd.automation.service.ITours;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class BasicTravelTest extends AbstractTest implements IHotels, ITours {

    public static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    protected Login login = new Login();
}
