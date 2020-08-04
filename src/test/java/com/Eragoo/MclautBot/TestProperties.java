package com.Eragoo.MclautBot;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class TestProperties {
    static String testStringFiled;

    static {
        PropertiesConfiguration cfg = new PropertiesConfiguration();
        try {
            cfg.load("test-app.yml");
        } catch (ConfigurationException e) {
            throw new RuntimeException();
        }
        testStringFiled = cfg.getString("test-string-property");
    }
}
