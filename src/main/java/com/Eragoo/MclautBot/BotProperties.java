package com.Eragoo.MclautBot;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.EnvironmentConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration;

public class BotProperties {
    public static final String USERNAME = "MclautBot";
    public static String TOKEN;

    static {
        PropertiesConfiguration cfg = new PropertiesConfiguration();
        EnvironmentConfiguration environmentConfiguration = new EnvironmentConfiguration();
        try {
            cfg.load("application.yml");
        } catch (ConfigurationException e) {
            throw new RuntimeException();
        }
        TOKEN = environmentConfiguration.getString("BOT_TOKEN");
        if (TOKEN == null) {
            TOKEN = cfg.getString("bot-token");
        }
    }
}
