package com.Eragoo.MclautBot;

import org.junit.Assert;
import org.junit.Test;

public class PropertiesConfigTest {

    @Test
    public void testStringPropertyInjected() {
        String testStringValue = "test";
        Assert.assertEquals(testStringValue, TestProperties.testStringFiled);
    }

    @Test
    public void botPropertiesTokenNotNull() {
        Assert.assertNotNull(BotProperties.TOKEN);
    }

    @Test
    public void environmentVariableLoads() {
        String expectedVar = "test-var";
        Assert.assertEquals(expectedVar, TestProperties.envVar);
    }
}
