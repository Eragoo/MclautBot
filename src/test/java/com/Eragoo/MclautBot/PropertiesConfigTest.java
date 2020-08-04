package com.Eragoo.MclautBot;

import org.junit.Assert;
import org.junit.Test;

public class PropertiesConfigTest {

    @Test
    public void testStringPropertyInjected() {
        String testStringValue = "test";
        Assert.assertEquals(testStringValue, TestProperties.testStringFiled);
    }
}
