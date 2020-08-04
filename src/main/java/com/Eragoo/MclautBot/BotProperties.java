package com.Eragoo.MclautBot;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class BotProperties {
    public static String TOKEN;

    static {
        PropertiesConfiguration cfg = new PropertiesConfiguration();
        try {
            cfg.load("application.yml");
        } catch (ConfigurationException e) {
            throw new RuntimeException();
        }
        TOKEN = cfg.getString("bot-token");
    }
}
